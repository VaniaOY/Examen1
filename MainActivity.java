package com.example.cecyt9.examen1_ortiz_yescas_vania_alice_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    EditText cantidad;
    double canti= 1.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         cantidad = (EditText) findViewById(R.id.editTextMoneda);
     /*   if (cantidad != null) {
            System.out.println(cantidad.getText());
        }
        else{canti = (Double.parseDouble(cantidad.getText().toString()));
        }*/
    }
    public void  onClickConvertir(View v){
        System.out.println(cantidad.getText());
        Intent envia = new Intent(this, actividad2.class);
        Bundle datos = new Bundle();
        datos.putDouble("resultado", Double.parseDouble(cantidad.getText().toString().trim())/15);
        envia.putExtra("datos",datos);
        finish();
        startActivity(envia);


    }
}
