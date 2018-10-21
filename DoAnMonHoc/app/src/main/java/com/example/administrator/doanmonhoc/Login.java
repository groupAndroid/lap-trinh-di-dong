package com.example.administrator.doanmonhoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button login;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.button_DangNhap);
        signin=findViewById(R.id.button_DangKy);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,Signin.class);
                intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivityForResult(intent,100);
            }
        });
    }
}
