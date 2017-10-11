package com.example.manolo.a05_calculadorabasicaspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tvResultado;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tvResultado=(TextView)findViewById(R.id.tvResultado);
        spinner=(Spinner)findViewById(R.id.spinner);

        String []valoresDelSpinner={"Sumar", "Restar", "Multiplicar", "Dividir"};

        ArrayAdapter <String>adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresDelSpinner);
        spinner.setAdapter(adaptador);
    }

    public void operar(View v){
        double ope1, ope2;
        ope1=Double.parseDouble(et1.getText().toString());
        ope2=Double.parseDouble(et2.getText().toString());


        String miOpcion=spinner.getSelectedItem().toString();

        switch(miOpcion){
            case "Sumar":
                tvResultado.setText(""+(ope1+ope2));
                break;
            case "Restar":
                tvResultado.setText(""+(ope1-ope2));
                break;
            case "Multiplicar":
                tvResultado.setText(""+(ope1*ope2));
                break;
            case "Dividir":
                tvResultado.setText(""+(ope1/ope2));
                break;


        }
    }

}
