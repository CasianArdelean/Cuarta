package com.example.dm2.cuarta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Ejer4b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer4b);

        Bundle b=getIntent().getExtras();

        String nombre=b.getString("nombre");
        String apellido=b.getString("apellido");
        String rad=b.getString("radio");
        String check=b.getString("check");

        Log.i("res:","res"+rad);

        TextView t1=(TextView) findViewById(R.id.nombre);
        t1.setText("El nombre es: "+nombre);
        TextView t2=(TextView) findViewById(R.id.ap);
        t2.setText("El apellido es: "+apellido);
        TextView t3=(TextView) findViewById(R.id.ra);
        t3.setText("El sexo es: "+rad);
        if(!check.equals("")){
            TextView t4=(TextView) findViewById(R.id.ch);
            t4.setText("Sus aficiones son: "+check);
        }

    }
}
