package com.example.travis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class signup_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);
        Button bt_cancle,bt_ok;
        bt_cancle = findViewById(R.id.bt_cancle);
        bt_ok = findViewById(R.id.bt_ok);
        bt_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup_activity.this, login_activity.class);
                startActivity(intent);
                finish();
            }
        });
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup_activity.this, home_activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}