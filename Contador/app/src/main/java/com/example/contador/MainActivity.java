package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView texto;
    private  int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         texto = findViewById(R.id.contador);

    }

    public void iniciarBtn (View v) {

        contador++;
        texto.setText(String.valueOf(contador));


    }

}