package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2);
    }

    public void iniciar (View v){
        EditText usu=(EditText)findViewById(R.id.usuario);
        String u=usu.getText().toString();
        EditText pass=(EditText)findViewById(R.id.contraeña);
        String p=pass.getText().toString();

        Intent in =new Intent(Ejer2.this,Ejer2b.class);
        in.putExtra("usuario",u);
        in.putExtra("contraseña",p);
        startActivity(in);

    }
}
