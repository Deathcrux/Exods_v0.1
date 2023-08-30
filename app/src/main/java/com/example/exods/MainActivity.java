package com.example.exods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private CheckBox chkSeleccionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkSeleccionar = (CheckBox) findViewById(R.id.chkSeleccionar);
    }

    public void btnCheck(View v) {
        if (chkSeleccionar.isChecked() == true) {
            String mensaje = "Seleccionado";
            Toast toast = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();
        } else {
            String mensaje = "Se ah Seleccionado el Botón";
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        }
    }
}