package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer1);
    }

    public void volver(View v){
        Intent ejer = new Intent(Ejer1.this,MainActivity.class);
        startActivity(ejer);
    }

    public void verificar (View v){
        EditText n=(EditText) findViewById(R.id.nombre);
        EditText a=(EditText) findViewById(R.id.apellido);

        if(n.getText().length()>0 && a.getText().length()>0){
            Intent ejer = new Intent(Ejer1.this,Ejer1b.class);
            ejer.putExtra("nombre",n.getText().toString());
            ejer.putExtra("apellido",a.getText().toString());
            startActivityForResult(ejer,1);
        }

    }

    public void onActivityResult(int cod,int res, Intent data){
        if(cod==1 && res==RESULT_OK){
            TextView t=(TextView) findViewById(R.id.condiciones);
            t.setText("Acepta condiciones: ACEPTADO");
        }else{
            TextView t=(TextView) findViewById(R.id.condiciones);
            t.setText("Acepta condiciones: CANCELADO");
        }

    }

}
