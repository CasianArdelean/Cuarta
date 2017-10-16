package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ejer1b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer1b);

        Bundle bundle=getIntent().getExtras();
        String n=bundle.getString("nombre");
        String a=bundle.getString("apellido");
        TextView t=(TextView)findViewById(R.id.pregunta);
        t.setText("Hola "+n+" "+a+" ¿Aceptas las condiciones?");
    }

    public void res (View v){
        Button b=(Button) findViewById(v.getId());

        if(b.getText().equals("ACEPTAR")){
            Intent in=new Intent();
            setResult(RESULT_OK,in);
            finish();
        }else{
            Intent in=new Intent();
            setResult(RESULT_CANCELED,in);
            finish();
        }


    }
}
