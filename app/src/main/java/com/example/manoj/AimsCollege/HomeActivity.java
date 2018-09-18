package com.example.manoj.AimsCollege;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
private static LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        introduction();
        syllabus();


    }

    public void introduction(){
        linearLayout = findViewById(R.id.intro);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AimsIntroduction.class);
                startActivity(intent);

            }
        });
    }

    public void syllabus(){
        linearLayout = findViewById(R.id.syllabus);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Syllabus.class);
                startActivity(intent);

            }
        });
    }


}
