package com.computomovil.app1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String LOGTAG="Información";

    TextView tvSaludo;
    Button btnSaludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Código que relaciona al layout
        //Log.i(LOGTAG,"Hola mundo");

        tvSaludo=findViewById(R.id.tvSaludo);
        btnSaludo=findViewById(R.id.btnSaludo);

        //tvSaludo.setText(getResources().getString(R.string.btnSaludo));

        //Metodo por medio de un Click Listener
        /*
        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSaludo.setText(getResources().getString(R.string.btnClick));
            }
        });*/

        //Referenciando para el método 2
        tvSaludo.setOnClickListener(this);
        btnSaludo.setOnClickListener(this);

    }

    //Metodo por medio de un click listener para muchos elementos con el metodo

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnSaludo:
                tvSaludo.setText(getResources().getString(R.string.btnClick));
                break;

            case R.id.tvSaludo:
                tvSaludo.setText(getResources().getString(R.string.app_name));
                break;

            default:
                break;
        }
    }
}