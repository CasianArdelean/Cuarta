package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejer3b extends AppCompatActivity {
    private boolean boo=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer3b);

        Bundle bun=getIntent().getExtras();
        int uno=Integer.parseInt(bun.getString("uno"));
        int dos=Integer.parseInt(bun.getString("dos"));
        int res=Integer.parseInt(bun.getString("res"));

        int suma=uno+dos;
        if(suma==res){
            TextView v=(TextView) findViewById(R.id.ver);
            v.setText("El resutlado de la operacion es CORRECTA");
            boo=true;
        }else{
            TextView v=(TextView) findViewById(R.id.ver);
            v.setText("El resutlado de la operacion es INCORRECTA");
        }
    }

    public void volver(View v){
        Intent in=new Intent();
        if(boo==true){
            setResult(RESULT_OK);
        }else{
            setResult(RESULT_CANCELED);
        }
        finish();
    }
}
