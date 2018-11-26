package io.github.nikkoes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nama = findViewById(R.id.namalengkap);
        TextView nama2 = findViewById(R.id.namalengkap2);

        String namalengkap = getIntent().getStringExtra("nama");

        nama.setText(namalengkap);
        nama2.setText(namalengkap);
    }
}
