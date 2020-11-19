package com.example.acalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1,num2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.TxtNumeroUno);
        num2=findViewById(R.id.TxtNumeroDos);
        resultado=findViewById(R.id.lblResultado);
    }
    public void calcular (View v){
        double n1,n2,suma;
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        suma=n1+n2;
        resultado.setText(String.valueOf(suma));
    }
}