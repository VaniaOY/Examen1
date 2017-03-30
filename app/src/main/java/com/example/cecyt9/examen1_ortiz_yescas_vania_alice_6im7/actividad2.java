package com.example.cecyt9.examen1_ortiz_yescas_vania_alice_6im7;

import android.content.Intent;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.content.Intent.ACTION_SEND;
import static android.content.Intent.ACTION_USER_PRESENT;
import static android.content.Intent.EXTRA_KEY_EVENT;

public class actividad2 extends AppCompatActivity {

    TextView muestra;
    float resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Bundle datosrecive = new Bundle();
        resultado = datosrecive.getFloat("resultado");
        muestra.findViewById(R.id.textViewResultado);
        muestra.setText(muestra.getText() + "\t" + datosrecive);

    }

    public void onClickEnviar() {
        Intent correo = new Intent();
        correo.addCategory(ACTION_SEND);
        Bundle detalles = new Bundle();
        detalles.putString(ACTION_USER_PRESENT, "eoropezag@ipn.mx");
        detalles.putString(EXTRA_KEY_EVENT, "Asusnto: examen 1er parcial" );
        detalles.putString(EXTRA_KEY_EVENT, "Contenido: "+ resultado);


    }


}
