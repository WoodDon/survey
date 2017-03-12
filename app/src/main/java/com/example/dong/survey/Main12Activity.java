package com.example.dong.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dong.survey.R;

public class Main12Activity extends AppCompatActivity {
    private Button bt1;
    public Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        bt1=(Button) findViewById(R.id.button_next12);
        mContext = this;
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,Main13Activity.class);
                startActivity(intent);
            }
        });
    }
}
