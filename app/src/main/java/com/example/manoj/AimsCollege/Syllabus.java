package com.example.manoj.AimsCollege;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Syllabus extends AppCompatActivity {

    WebView webView;
    TextView textView;
    ProgressBar progress, horizontalProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csit_syllabus);
        firstSem();
        secondSem();



    }
    public void firstSem(){
        textView = findViewById(R.id.firstsem);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Syllabus.this, FirstSem.class);
                startActivity(intent);

            }
        });
    }

    public void secondSem() {
        textView = findViewById(R.id.secondsem);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Syllabus.this, SecondSem.class);
                startActivity(intent);

            }
        });
    }
}
