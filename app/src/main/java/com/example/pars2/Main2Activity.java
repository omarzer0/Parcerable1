package com.example.pars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.tv);

        Intent i = getIntent();
        Contacts c = i.getExtras().getParcelable("contacts");
        tv.setText(c.getName() +" "+c.getSurname() +" "+ c.getIdx());
    }
}
