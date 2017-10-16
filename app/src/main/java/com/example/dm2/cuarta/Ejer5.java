package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ejer5 extends AppCompatActivity {
    private boolean esta=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer5);
        NumberPicker n=(NumberPicker) findViewById(R.id.pick1);
        n.setMaxValue(20);
        NumberPicker n2=(NumberPicker) findViewById(R.id.pick2);
        n2.setMaxValue(20);
        n2.setEnabled(false);
        ToggleButton t2=(ToggleButton) findViewById(R.id.t2);
        t2.setEnabled(false);
    }

    public void sw(View v){
        Switch s=(Switch) findViewById(R.id.uno);
        if(s.isChecked()){
            esta=true;
            NumberPicker n2=(NumberPicker) findViewById(R.id.pick2);
            n2.setEnabled(true);
            NumberPicker n=(NumberPicker) findViewById(R.id.pick1);
            n.setEnabled(false);

            ToggleButton t=(ToggleButton) findViewById(R.id.t1);
            t.setEnabled(false);
            ToggleButton t2=(ToggleButton) findViewById(R.id.t2);
            t2.setEnabled(true);


        }else{
            esta=false;
            NumberPicker n2=(NumberPicker) findViewById(R.id.pick2);
            n2.setEnabled(false);
            NumberPicker n=(NumberPicker) findViewById(R.id.pick1);
            n.setEnabled(true);
            ToggleButton t=(ToggleButton) findViewById(R.id.t1);
            t.setEnabled(true);
            ToggleButton t2=(ToggleButton) findViewById(R.id.t2);
            t2.setEnabled(false);
        }


    }

    public void verificar(View v){
        Intent in=new Intent(Ejer5.this,Ejer5b.class);
        if(esta==true){
            NumberPicker n2=(NumberPicker) findViewById(R.id.pick2);
            int n=n2.getValue();

            ToggleButton t2=(ToggleButton) findViewById(R.id.t2);
            boolean toggle=false;
            if(t2.isChecked()){
                toggle=true;
            }


            in.putExtra("numero",n);
            in.putExtra("toggle",toggle);

        }else{
            NumberPicker n1=(NumberPicker) findViewById(R.id.pick1);
            int n=n1.getValue();

            ToggleButton t1=(ToggleButton) findViewById(R.id.t1);
            boolean toggle=false;
            if(t1.isChecked()){
                toggle=true;
            }


            in.putExtra("numero",n);
            in.putExtra("toggle",toggle);


        }

        startActivity(in);


    }
}
