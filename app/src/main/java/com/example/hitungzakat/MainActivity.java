package com.example.hitungzakat;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
    GridLayout mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent (mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for(int i=0; i<mainGrid.getChildCount(); i++){
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI ==0){
                        Intent intent = new Intent(MainActivity.this, Hitung.class);
                        startActivity(intent);
                    }
                    else if(finalI ==1){
                        Intent intent = new Intent(MainActivity.this, TentangZakat.class);
                        startActivity(intent);
                    }
                    else if(finalI == 2){
                        Intent intent = new Intent(MainActivity.this, Tentang.class);
                        startActivity(intent);
                    }
                    else if(finalI == 3){
                        finish();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Anda Salah Tekan", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
@Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Apakah Anda Yakin Ingin Keluar ?");
        builder.setCancelable(false);
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }

        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        }).show();
        }
}



