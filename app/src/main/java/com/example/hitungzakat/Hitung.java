package com.example.hitungzakat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hitung extends AppCompatActivity {
        EditText editAnggota, editBeras;
        TextView textHasil1, textHasil2;
        Button btnHitung;

        public static double hasil1 = 0.0;
        public static double hasil2 = 0.0;
        public static double beras = 2.5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);
        textHasil1=(TextView)findViewById(R.id.textHasil1);
        textHasil2 = (TextView)findViewById(R.id.textHasil2);
        editAnggota = (EditText)findViewById(R.id.editAnggota);
        editBeras = (EditText)findViewById(R.id.editBeras);
        btnHitung = (Button)findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(editAnggota.getText().toString());
                Double b = Double.parseDouble(editBeras.getText().toString());

                hasil1 = beras*(a*b);
                hasil2 = a*beras;

                textHasil1.setText("Membayar Zakat Berupa Uang Tunai Sejumlah Rp. "+((int)hasil1));
                textHasil2.setText("Atau Membayar Zakat Berupa Beras Seberat "+((int)hasil2)+" Kilogram");


            }
        });
    }

   }
