package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ejer1 (View v){
        Intent ejer = new Intent(MainActivity.this, Ejer1.class);
        startActivity(ejer);
    }
    public void ejer2 (View v){
        Intent ejer = new Intent(MainActivity.this, Ejer2.class);
        startActivity(ejer);
    }

    public void ejer3 (View v){
        Intent ejer = new Intent(MainActivity.this, Ejer3.class);
        startActivity(ejer);
    }
    public void ejer4 (View v){
        Intent ejer = new Intent(MainActivity.this, Ejer4.class);
        startActivity(ejer);
    }
    public void ejer5 (View v){
        Intent ejer = new Intent(MainActivity.this, Ejer5.class);
        startActivity(ejer);
    }

    public void salir(View v){
        finish();
    }
}
