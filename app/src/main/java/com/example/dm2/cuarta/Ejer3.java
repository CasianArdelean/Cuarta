package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Ejer3 extends AppCompatActivity {
     static int bn=0;
     static int mal=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer3);
       recargar();
    }

    public void recargar(){
        Random rand = new Random();
        int n = rand.nextInt(100);

        EditText u=(EditText) findViewById(R.id.uno);
        u.setText(String.valueOf(n));

        int d = rand.nextInt(100);
        EditText dos=(EditText) findViewById(R.id.dos);
        dos.setText(String.valueOf(d));
    }




    public void res(View v){
        Intent in=new Intent(Ejer3.this,Ejer3b.class);

        EditText u=(EditText) findViewById(R.id.uno);
        String uno=u.getText().toString();

        EditText d=(EditText) findViewById(R.id.dos);
        String dos=d.getText().toString();

        EditText r=(EditText) findViewById(R.id.res);
        String res=r.getText().toString();

        in.putExtra("uno",uno);
        in.putExtra("dos",dos);
        in.putExtra("res",res);
        startActivityForResult(in,1);
    }

    public void onActivityResult(int cod, int result, Intent in){
        if(cod==1 && result==RESULT_OK){
            TextView t=(TextView) findViewById(R.id.correcto);
            bn=bn+1;
            t.setText("PREGUNTAS CORRECTAS: "+bn);

        }else{
            TextView t=(TextView) findViewById(R.id.incorrecto);
            mal=mal+1;
            t.setText("INCORRECTAS: "+mal);

        }
        EditText r=(EditText) findViewById(R.id.res);
        r.setText("");
        recargar();
    }
}
