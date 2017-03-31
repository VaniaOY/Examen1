package com.example.cecyt9.examen1_ortiz_yescas_vania_alice_6im7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.content.Intent.EXTRA_EMAIL;
import static android.content.Intent.EXTRA_SUBJECT;
import static android.content.Intent.EXTRA_TEXT;

public class actividad2 extends Activity {

    TextView muestra;
    double resultado;
    Bundle datosrecive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        muestra = (TextView) findViewById(R.id.textViewResultado);
        datosrecive = new Bundle();
        savedInstanceState = this.getIntent().getExtras();
        resultado = savedInstanceState.getDouble("resultado");
        //muestra.setText(muestra.getText() + "\t" + resultado);

    }

    public void onClickEnviar(View v) {
        Intent correo = new Intent(Intent.ACTION_SEND);
        correo.putExtra(EXTRA_EMAIL, new String[] {"eoropezag@ipn.mx"});
        correo.putExtra(EXTRA_SUBJECT, "Asusnto: examen 1er parcial" );
        correo.putExtra(EXTRA_TEXT, "Contenido: "+ resultado);
        startActivity(correo);

    }


}