package com.example.vsga_ujikompetensi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbhelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "kampusku.db";
    private static final int DATABASE_VERSION = 1;

    public dbhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE mahasiswa(nomor INTEGER PRIMARY KEY, nama TEXT, tanggal TEXT, jk TEXT, alamat TEXT);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) {
            // Jika versi database baru lebih besar dari versi database lama,
            // Anda dapat melakukan penanganan upgrade skema di sini.
            // Misalnya, menambahkan kolom baru atau mengubah struktur tabel.
            // Pastikan Anda melakukan migrasi data dengan aman jika diperlukan.
            // Contoh:
            // if (oldVersion < 2) {
            //     db.execSQL("ALTER TABLE mahasiswa ADD COLUMN email TEXT;");
            // }
        }
    }
}
