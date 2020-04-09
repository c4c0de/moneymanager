package com.example.moneymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Button mainact;
        mainact = findViewById(R.id.btnact);
        mainact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainatc();

            }
        });
    }
    private void mainatc(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
