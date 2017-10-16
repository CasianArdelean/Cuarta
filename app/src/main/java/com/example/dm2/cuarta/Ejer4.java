package com.example.dm2.cuarta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Ejer4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer4);
    }

    public void validar(View v){
        EditText t=(EditText) findViewById(R.id.nombre);
        String nombre=t.getText().toString();
        EditText a=(EditText) findViewById(R.id.apellido);
        String apellido=a.getText().toString();
        RadioGroup radio=(RadioGroup) findViewById(R.id.grupo);
        RadioButton rad=(RadioButton)findViewById(radio.getCheckedRadioButtonId());
        String ra= (String) rad.getText();

        CheckBox ch1=(CheckBox) findViewById(R.id.musica);
        CheckBox ch2=(CheckBox) findViewById(R.id.lectura);
        CheckBox ch3=(CheckBox) findViewById(R.id.deportes);
        CheckBox ch4=(CheckBox) findViewById(R.id.viajar);

        String check="";
        if(ch1.isChecked()){
            check+=" "+ch1.getText();
        }
        if(ch2.isChecked()){
            check+=" "+ch2.getText();
        }
        if(ch3.isChecked()){
            check+=" "+ch3.getText();
        }
        if(ch4.isChecked()){
            check+=" "+ch4.getText();
        }

        Log.i("Resultado"," res: "+ra);
        Intent in =new Intent(Ejer4.this,Ejer4b.class);
        in.putExtra("nombre",nombre);
        in.putExtra("apellido",apellido);
        in.putExtra("radio",ra);
        in.putExtra("check",check);
        startActivity(in);
    }
}
