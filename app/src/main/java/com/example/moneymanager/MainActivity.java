package com.example.moneymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button detail;
        detail=findViewById(R.id.btndtl);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendetail();
            }
        });

    }
    private void opendetail(){
        Intent j=new Intent(this,details.class);
        startActivity(j);
    }
}
