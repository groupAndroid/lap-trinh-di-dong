package com.example.tranducphuong.quanlychitieucanhan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_ThemKhoanThu extends AppCompatActivity {

    ImageButton button;
    //List<> list_khoanthu= new List<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__them_khoan_thu);

        button=findViewById(R.id.add_khoanthu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
