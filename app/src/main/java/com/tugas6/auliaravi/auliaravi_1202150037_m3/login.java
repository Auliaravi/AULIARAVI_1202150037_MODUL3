package com.tugas6.auliaravi.auliaravi_1202150037_m3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        EditText username = findViewById(R.id.username);
        //memasuka username
        EditText password = findViewById(R.id.password);
        String message;
        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE"))
        // memasukan username dan password sesuai dengan yang telah dimasukan
            {
            message = "Selamat anda berhasil Login!";
            //notifikasi untuk login sukses
            startActivity(new Intent(this, MainActivity.class));
        } else {
            message = "Maaf anda gagal login";
            finish();
            //notifikasi jika login gagal
            startActivity(getIntent());
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        //mengeluarkan notofikasi yang telah dibuat
    }
}
