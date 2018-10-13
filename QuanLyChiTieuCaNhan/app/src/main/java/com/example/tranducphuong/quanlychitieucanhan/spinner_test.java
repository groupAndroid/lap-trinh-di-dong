package com.example.tranducphuong.quanlychitieucanhan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

public class spinner_test extends AppCompatActivity {

    Toolbar toolbar;
    List<String> lst=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_test);

        generateData();
        Spinner spinner= findViewById(R.id.spinner);
        SpinnerAdapter adapter= new spinnerAdapter(spinner_test.this,R.layout.spinner_item,lst);
        spinner.setAdapter(adapter);
    }
    private void generateData() {
        for(int i=0;i<10;i++)
        {
            lst.add("item "+i);
        }
    }
}
