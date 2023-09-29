package com.example.practica4calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnC, btnequal, btnsum, btnmul, btnres, btndiv, btnmenos, btnpunto, btndel;
    private TextView TextoSecuencia;
    private double valor = 0;
    private String operacion = "";
    private double resultado = 0;
    private StringBuilder secuencia = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextoSecuencia = findViewById(R.id.texto);
        btnC = findViewById(R.id.btn);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btndiv = findViewById(R.id.btndiv);
        btnsum = findViewById(R.id.btnsum);
        btnres = findViewById(R.id.btnres);
        btnmul = findViewById(R.id.btnmul);

        btnmenos = findViewById(R.id.btnmenos);
        btnequal = findViewById(R.id.btnigual);
        btnpunto = findViewById(R.id.btnpunto);
        btndel = findViewById(R.id.btndel);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = 0;
                secuencia.setLength(0);
                TextoSecuencia.setText("");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("1");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("2");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("3");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("4");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("5");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("6");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("7");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("8");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("9");
                TextoSecuencia.setText(secuencia.toString());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuencia.append("0");
                TextoSecuencia.setText(secuencia.toString());

                int lenght = secuencia.length();
                Toast.makeText(getApplicationContext(), "Lenght: "+ lenght , Toast.LENGTH_SHORT).show();

            }
        });

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String secuencia2 = secuencia.toString();

                try {
                    valor = Double.parseDouble(secuencia2);
                    secuencia.setLength(0);
                    resultado += valor;
                    operacion = "+";

                    TextoSecuencia.setText("");
                    Toast.makeText(getApplicationContext(), "Número entero: " + resultado, Toast.LENGTH_SHORT).show();

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Secuencia no válida", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String secuencia2 = secuencia.toString();

                try {
                    valor = Double.parseDouble(secuencia2);
                    secuencia.setLength(0);
                    if(resultado == 0){
                        resultado += valor;
                        operacion = "x";
                    }
                    else {
                        double valor2 = resultado;
                        resultado =  valor2 * valor;
                        operacion = "x";
                    }
                    TextoSecuencia.setText("");
                    Toast.makeText(getApplicationContext(), "Número entero: " + resultado, Toast.LENGTH_SHORT).show();

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Secuencia no válida", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String secuencia2 = secuencia.toString();

                try {
                    if(valor > 0){
                        valor = Double.parseDouble(secuencia2);
                        secuencia.setLength(0);
                        resultado += valor;
                        operacion = "-";
                    }
                    else{
                        valor = Double.parseDouble(secuencia2);
                        secuencia.setLength(0);
                        resultado += valor;
                        operacion = "-";
                    }


                    TextoSecuencia.setText("");
                    Toast.makeText(getApplicationContext(), "Número entero: " + resultado, Toast.LENGTH_SHORT).show();

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Secuencia no válida", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!secuencia.toString().contains(".")){
                    secuencia.append(".");
                    TextoSecuencia.setText(secuencia.toString());
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String secuencia2 = secuencia.toString();

                try {
                    valor = Double.parseDouble(secuencia2);
                    secuencia.setLength(0);
                    if(resultado == 0){
                        resultado += valor;
                        operacion = "/";
                    }
                    else {
                        double valor2 = resultado;
                        resultado =  valor2 / valor;
                        operacion = "/";
                    }
                    TextoSecuencia.setText("");
                    Toast.makeText(getApplicationContext(), "Número entero: " + resultado, Toast.LENGTH_SHORT).show();

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Secuencia no válida", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String secuencia2 = secuencia.toString();
                if(!secuencia2.isEmpty()){
                    int lenght = secuencia.length();
                    secuencia.deleteCharAt(lenght -1);
                    TextoSecuencia.setText(secuencia.toString());
                }
            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!secuencia.toString().startsWith("-")) {
                    secuencia.insert(0, "-");
                    TextoSecuencia.setText(secuencia.toString());
                }
                else{
                    if (secuencia.length() > 0 && secuencia.charAt(0) == '-') {
                        secuencia.deleteCharAt(0);
                        TextoSecuencia.setText(secuencia.toString());
                    }
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String secuencia2 = secuencia.toString();

                    if(secuencia2.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Secuencia no válida", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        valor = Double.parseDouble(secuencia2);

                        switch (operacion){
                            case "+":
                                resultado += valor;
                                break;
                            case "x":
                                if(resultado == 0){
                                }
                                else {
                                    double valor2 = resultado;
                                    resultado =  valor2 * valor;
                                }
                                break;
                            case "-":
                                resultado -= valor;
                                break;
                            case "/":
                                if(resultado == 0){
                                }
                                else{
                                    double valor2 = resultado;
                                    resultado =  valor2 / valor;
                                }
                                break;
                        }
                        if(resultado == 0){

                        }
                        else{
                            secuencia.setLength(0);
                            TextoSecuencia.setText(Double.toString(resultado));
                            Toast.makeText(getApplicationContext(), "Número entero: " + resultado, Toast.LENGTH_SHORT).show();
                            resultado = 0;
                        }
                    }
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}