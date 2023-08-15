package com.example.vsga_ujikompetensi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CreateActivity extends AppCompatActivity {
    protected Cursor cursor;
    dbhelper database;
    Button btn_simpan;
    EditText nomor, nama, tanggal, jk, alamat;
    ImageButton actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        actionBar = findViewById(R.id.backButton);

        database = new dbhelper(this);
        nomor = findViewById(R.id.nomor);
        nama = findViewById(R.id.nama);
        tanggal = findViewById(R.id.tanggal);
        jk = findViewById(R.id.jk);
        alamat = findViewById(R.id.alamat);
        btn_simpan = findViewById(R.id.buttonsimpan);

        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = database.getWritableDatabase();
                db.execSQL("INSERT INTO mahasiswa(nomor, nama, tanggal, jk, alamat) VALUES('" +
                        nomor.getText().toString() + "','" +
                        nama.getText().toString() + "','" +
                        tanggal.getText().toString() + "','" +
                        jk.getText().toString() + "','" +
                        alamat.getText().toString() + "')");
                Toast.makeText(CreateActivity.this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
                ListDataActivity.ma.RefreshList();
                finish();
            }
        });
        actionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Kembali ke halaman sebelumnya
            }
        });


    }


}
