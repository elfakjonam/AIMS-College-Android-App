package com.example.manoj.AimsCollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FirstSem extends AppCompatActivity {

    PDFView firstSem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_sem);

        firstSem= findViewById(R.id.pdfview);

        firstSem.fromAsset("firstsem.pdf").load();
    }
}
