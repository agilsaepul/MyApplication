package io.github.nikkoes.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_implist = findViewById(R.id.btn_implist);
        Button btn_explist = findViewById(R.id.btn_explist);
        Button btn_send = findViewById(R.id.btn_send);
        final EditText namalengkap = findViewById(R.id.txtNama);
        btn_explist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explistIntent = new Intent(MainActivity.this, Second.class);
                startActivity(explistIntent);
            }
        });

        btn_implist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implistIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.co.id"));
                startActivity(implistIntent);
            }
        });

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Second.class);
                i.putExtra("nama", namalengkap.getText().toString());
                startActivity(i);
            }
        });




    }
}
