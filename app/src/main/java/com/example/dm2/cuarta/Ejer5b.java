package com.example.dm2.cuarta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejer5b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer5b);

        Bundle b=getIntent().getExtras();
        int numero=b.getInt("numero");
        boolean bool=b.getBoolean("toggle");

        TextView t1=(TextView) findViewById(R.id.temp);
        t1.setText("La temperatura a subido "+numero+" grados");
        TextView t2=(TextView) findViewById(R.id.luz);
        if(bool==true){
            t2.setText("La luz esta encencidad");
        }else{
            t2.setText("La luz esta apagada");
        }

    }
}
