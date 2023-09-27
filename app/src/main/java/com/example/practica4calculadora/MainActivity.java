package com.example.practica4calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnC, btnequal, btnsum;
    private TextView TextoSecuencia;
    private double valor = 0;
    private double valor2 = 0;
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

        btnsum = findViewById(R.id.btnsum);
        btnequal = findViewById(R.id.btnigual);


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
            }
        });

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String secuencia2 = secuencia.toString();

                try {
                    valor = Double.parseDouble(secuencia2);
                    secuencia.setLength(0);
                    resultado += valor + valor2;

                    TextoSecuencia.setText("");
                    Toast.makeText(getApplicationContext(), "Número entero: " + valor, Toast.LENGTH_SHORT).show();

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Secuencia no válida", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String secuencia2 = secuencia.toString();
                valor = Double.parseDouble(secuencia2);
                secuencia.setLength(0);
                resultado += valor + valor2;
                TextoSecuencia.setText(Double.toString(resultado));
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}