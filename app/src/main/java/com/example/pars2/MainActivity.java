package com.example.pars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(MainActivity.this , Main2Activity.class );
        Contacts c = new Contacts("omar","adel",100);
        i.putExtra("contacts",c);
        startActivity(i);
    }
}
