package com.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,npunto,ndelete,nigual;
    private Button nsuma,nresta,nmulti,ndividir;


    String b="";
    String a="";
    private TextView entrada,salida;

    boolean decimal=false;
    boolean suma=false;
    boolean resta=false;
    boolean multi=false;
    boolean dividir=false;
    Double[] numero= new Double[20];
    Double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(Button)findViewById(R.id.pb1);
        n1.setOnClickListener(this);
        n2=(Button)findViewById(R.id.pb2);
        n2.setOnClickListener(this);
        n2=(Button)findViewById(R.id.pb2);
        n2.setOnClickListener(this);
        n3=(Button)findViewById(R.id.pb3);
        n3.setOnClickListener(this);
        n4=(Button)findViewById(R.id.pb4);
        n4.setOnClickListener(this);
        n5=(Button)findViewById(R.id.pb5);
        n5.setOnClickListener(this);
        n6=(Button)findViewById(R.id.pb6);
        n6.setOnClickListener(this);
        n7=(Button)findViewById(R.id.pb7);
        n7.setOnClickListener(this);
        n8=(Button)findViewById(R.id.pb8);
        n8.setOnClickListener(this);
        n9=(Button)findViewById(R.id.pb9);
        n9.setOnClickListener(this);
        n0=(Button)findViewById(R.id.pb0);
        n0.setOnClickListener(this);

        nigual=(Button)findViewById(R.id.pbigual);
        nigual.setOnClickListener(this);
        npunto=(Button)findViewById(R.id.pbpunto);
        npunto.setOnClickListener(this);
        nsuma=(Button)findViewById(R.id.pbsuma);
        nsuma.setOnClickListener(this);
        nresta=(Button)findViewById(R.id.pbresta);
        nresta.setOnClickListener(this);
        nmulti=(Button)findViewById(R.id.pbmultiplicacion);
        nmulti.setOnClickListener(this);
        ndividir=(Button)findViewById(R.id.pbdivision);
        ndividir.setOnClickListener(this);
        ndelete=(Button)findViewById(R.id.pbdelete);
        ndelete.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        entrada=(TextView)findViewById(R.id.TxtEntrada);
        salida=(TextView)findViewById(R.id.TxtSalida);

        int seleccion=v.getId();

                try {
            switch (seleccion) {
                case R.id.pb1:
                    a=a+"1";
                    entrada.setText(a);
                    b = b + "1";
                    break;
                case R.id.pb2:
                    a=a+"2";
                    entrada.setText(a);
                    b = b+ "2";
                    break;
                case R.id.pb3:
                    a=a+"3";
                    entrada.setText(a);
                    b = b + "3";
                    break;
                case R.id.pb4:
                    a=a+"4";
                    entrada.setText(a);
                    b = b + "4";
                    break;
                case R.id.pb5:
                    a=a+"5";
                    entrada.setText(a);
                    b = b + "5";
                    break;
                case R.id.pb6:
                    a=a+"6";
                    entrada.setText(a);
                    b = b + "6";
                    break;
                case R.id.pb7:
                    a=a+"7";
                    entrada.setText(a);
                    b = b + "7";
                    break;
                case R.id.pb8:
                    a=a+"8";
                    entrada.setText(a);
                    b = b + "8";
                    break;
                case R.id.pb9:
                    a=a+"9";
                    entrada.setText(a);
                    b = b + "9";
                    break;
                case R.id.pb0:
                    a=a+"0";
                    entrada.setText(a);
                    b = b + "0";
                    break;

                case R.id.pbpunto:
                    if(decimal==false) {
                        a=a+".";
                        entrada.setText(a);
                        b = b + ".";
                        decimal = true;
                    }else{return;}
                    break;
                case R.id.pbsuma:
                    suma=true;
                    a=a+"+";
                    resultado=Double.parseDouble(b);

                    entrada.setText(a);
                    b="";
                    break;
                case R.id.pbresta:
                    resta=true;
                    a=a+"-";
                    resultado=Double.parseDouble(b);

                    entrada.setText(a);
                    b="";
                    break;
                case R.id.pbmultiplicacion:
                    multi=true;
                    a=a+"x";
                    resultado=Double.parseDouble(b);

                    entrada.setText(a);
                    b="";
                    break;
                case R.id.pbdivision:
                    dividir=true;
                    a=a+"/";
                    resultado=Double.parseDouble(b);

                    entrada.setText(a);
                    b="";
                    break;

                case R.id.pbdelete:
                    a="";
                    entrada.setText(a);
                    b="";
                    resultado=0.0;
                    salida.setText(String.valueOf(resultado));
                    break;

                case R.id.pbigual:

                    if(suma==true){
                        resultado=resultado+Double.parseDouble(b);
                        b=String.valueOf(resultado);
                        salida.setText(String.valueOf(resultado));
                        suma=false;


                    }else if(resta==true){
                        resultado=resultado-Double.parseDouble(b);
                        b=String.valueOf(resultado);
                        salida.setText(String.valueOf(resultado));
                        resta=false;

                    }else if(multi==true) {
                        resultado = resultado * Double.parseDouble(b);
                        b=String.valueOf(resultado);
                        salida.setText(String.valueOf(resultado));
                        multi=false;

                    }else if(dividir==true) {
                        resultado = resultado / Double.parseDouble(b);
                        b=String.valueOf(resultado);
                        salida.setText(String.valueOf(resultado));
                        dividir=false;
                    }else

                        break;

            }
        }

        catch(Exception e){
        entrada.setText("error");
            };

        };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
