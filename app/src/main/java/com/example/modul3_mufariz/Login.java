package com.example.modul3_mufariz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText username = findViewById(R.id.nama);
        EditText Password = findViewById(R.id.password);
        Button kembali = findViewById(R.id.Batal);
        Button Login = findViewById(R.id.Login);

        Login.setOnClickListener(v -> {
            String Username = username.getText().toString();
            String password = Password.getText().toString();
            if(Username.equals("rafi")&& password.equals("1234")){

                Toast.makeText(this, "Selamat Login Berhasil", Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show();
            }
        });

        kembali.setOnClickListener(v -> {
            Intent i = new Intent( this,MainActivity.class);
            startActivity(i);
        });
    }
}