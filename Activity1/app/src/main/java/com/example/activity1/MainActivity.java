package com.example.activity1;

import static android.content.Intent.ACTION_VIEW;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=Bx_qsu-kQ2U");
            }
        });
    }
        private void gotoUrl(String s){
           Uri uri= Uri.parse(s);
           startActivity(new Intent(Intent.ACTION_VIEW , uri));

    }
}