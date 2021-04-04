package com.example.tugas2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HasilActivity extends AppCompatActivity {

    private TextView tvNama, tvNIM, tvNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);

        tvNama     = findViewById(R.id.tv_nama);
        tvNIM      = findViewById(R.id.tv_nim);
        tvNilai = findViewById(R.id.tv_nilai);

        Bundle extras = getIntent().getExtras();

        String nama = extras.getString("Nama");
        tvNama.setText(String.format("Nama : %s", nama));

        String nim = extras.getString("NIM");
        tvNIM.setText(String.format("NIM : %s", nim));

        String hasil = extras.getString("Hasil");
        tvNilai.setText(String.format("Nilai : %s", hasil));
    }
}
