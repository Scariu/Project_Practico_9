package com.example.project_practico_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int imagen1 = R.drawable.manzana;
    int imagen2 = R.drawable.frutilla;
    int imagen3 = R.drawable.pi_a;
    int imagen4 = R.drawable.sandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();

    }

    private void initListeners() {
        ImageButton boton1 = findViewById(R.id.button1);
        ImageButton boton2 = findViewById(R.id.button2);
        ImageButton boton3 = findViewById(R.id.button3);
        ImageButton boton4 = findViewById(R.id.button4);
        Button botonSalir = findViewById(R.id.buttonSalir);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen1);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen2);
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen3);
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen4);
            }
        });
       botonSalir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
}
    public void moveToSecondActivity(int imagen) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Clave", imagen);
        startActivity(intent);
    }
}
