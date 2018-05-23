package com.example.hammer.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.FileSystemAlreadyExistsException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView salida1,salida2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salida1 = findViewById(R.id.TextoEmpezar);
        salida2 =  findViewById(R.id.text_restultado);

        View boton1 = findViewById(R.id.num_1);
        boton1.setOnClickListener(this);

        View boton2 = findViewById(R.id.num_2);
        boton2.setOnClickListener(this);

        View boton3 = findViewById(R.id.num_3);
        boton3.setOnClickListener(this);

        View boton4 = findViewById(R.id.num_4);
        boton4.setOnClickListener(this);

        View boton5 = findViewById(R.id.num_5);
        boton5.setOnClickListener(this);

        View boton6 = findViewById(R.id.num_6);
        boton6.setOnClickListener(this);

        View boton7 = findViewById(R.id.num_7);
        boton7.setOnClickListener(this);

        View boton8 = findViewById(R.id.num_8);
        boton8.setOnClickListener(this);

        View boton9 = findViewById(R.id.num_9);
        boton9.setOnClickListener(this);

        View boton0 = findViewById(R.id.num_0);
        boton0.setOnClickListener(this);

        View botonResta = findViewById(R.id.resta);
        botonResta.setOnClickListener(this);

        View botonSuma = findViewById(R.id.suma);
        botonSuma.setOnClickListener(this);

        View botonMultiplicar = findViewById(R.id.multiplicar);
        botonMultiplicar.setOnClickListener(this);

        View botonDividir = findViewById(R.id.dividir);
        botonDividir.setOnClickListener(this);

        View botonIgual = findViewById(R.id.boton_igual);
        botonIgual.setOnClickListener(this);

        View botonPunto = findViewById(R.id.punto);
        botonPunto.setOnClickListener(this);

        View botonBorrar = findViewById(R.id.borrar);
        botonBorrar.setOnClickListener(this);


    }

    double result, m1 = 0, m2 = 0;

    char op1 = '+';

    public void onClick(View v) {

        if (v.getId() == R.id.num_1) salida1.append("1");
        else if (v.getId() == R.id.num_2) salida1.append("2");
        else if (v.getId() == R.id.num_3) salida1.append("3");
        else if (v.getId() == R.id.num_4) salida1.append("4");
        else if (v.getId() == R.id.num_5) salida1.append("5");
        else if (v.getId() == R.id.num_6) salida1.append("6");
        else  if (v.getId() == R.id.num_7) salida1.append("7");
        else  if (v.getId() == R.id.num_8) salida1.append("8");
        else if (v.getId() == R.id.num_9) salida1.append("9");
        else  if (v.getId() == R.id.num_0) salida1.append("0");
        else  if (v.getId() == R.id.punto) salida1.append(".");

        else if (v.getId() == R.id.borrar) {
            salida1.setText("");
            salida2.setText("");


        }

        else if(v.getId() == R.id.suma) calcula('+');
        else if(v.getId() == R.id.resta) calcula('-');
        else if(v.getId() == R.id.multiplicar) calcula('*');
        else if(v.getId() == R.id.dividir) calcula('/');
        else if(v.getId() == R.id.boton_igual) calcula('=');




    }

    public void calcula(char op){

        double result=m1;
        String cadena= salida1.getText().toString();
        try{
            m2=Double.parseDouble(cadena);
            if(op1=='+') result=m1+m2;
            else if(op1=='-') result=m1-m2;
            else if(op1=='*') result=m1*m2;
            else if (op1=='/') result=m1/m2;
            m1=result;
            op1=op;


            if (op=='='){

                salida1.setText(""+m1);
                salida2.setText(""+m2);

            }else{

                salida1.setText("");
                salida2.setText(""+m1+op1);

            }


        }catch (NumberFormatException nfe){
            Toast.makeText(this,"numero incorrecto", Toast.LENGTH_LONG).show();
        }

    }
}



