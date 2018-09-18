package com.example.manoj.AimsCollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class SecondSem extends AppCompatActivity {
        PDFView secondSem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sem);

        secondSem= findViewById(R.id.pdfview);

        secondSem.fromAsset("secondsem.pdf").load();
    }
}
