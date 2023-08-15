package com.example.vsga_ujikompetensi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InformasiActivity extends AppCompatActivity {
    ImageButton actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);
        actionBar = findViewById(R.id.backButton);

        actionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Kembali ke halaman sebelumnya
            }
        });
    }

}