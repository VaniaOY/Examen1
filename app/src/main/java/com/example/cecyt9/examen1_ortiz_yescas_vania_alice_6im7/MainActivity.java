package com.example.cecyt9.examen1_ortiz_yescas_vania_alice_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView cantidad;
    float canti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         cantidad = (TextView) findViewById(R.id.texCanri);


    }
    public void  onClickConvertir(){
        Intent envia = new Intent(String.valueOf(R.layout.activity_actividad2));
        canti = Integer.parseInt((String) cantidad.getText())/15;
        Bundle datos = new Bundle();
        datos.putFloat("resultado", canti);
        envia.putExtra("datos",datos);
        finish();;
        startActivity(envia);


    }
}
