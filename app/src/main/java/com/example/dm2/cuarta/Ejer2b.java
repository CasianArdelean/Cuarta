package com.example.dm2.cuarta;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejer2b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2b);
        Bundle b=getIntent().getExtras();
        String usu=b.getString("usuario");
        String con=b.getString("contraseña");

        TextView t=(TextView)findViewById(R.id.res);

        if(usu.equals("casian") && con.equals("1234")){
            t.setBackgroundColor(Color.GREEN);
            t.setText("USUARIO Y PASSWORD CORRECTOS");
        }else{
            t.setBackgroundColor(Color.RED);
            t.setText("USUARIO Y/O PASSWORD INCORRECTOS");
        }

    }

    public void volver(View v){
        Intent in=new Intent(Ejer2b.this,MainActivity.class);
        startActivity(in);
    }
}
