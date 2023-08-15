package com.example.vsga_ujikompetensi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView btnLihat = findViewById(R.id.btn_lihat);
        TextView btnTambah = findViewById(R.id.btn_tambah);
        TextView btnInfo = findViewById(R.id.btn_informasi);

        btnLihat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent lihat = new Intent(Dashboard.this, ListDataActivity.class);
                startActivity(lihat);

            }
        });
        btnTambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent tambah = new Intent(Dashboard.this, CreateActivity.class);
                startActivity(tambah);

            }
        });
        btnLihat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent info = new Intent(Dashboard.this, ListDataActivity.class);
                startActivity(info);

            }
        });



    }
}