package com.example.dong.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private Button bt1;
    public Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将layout的activity_main2.xml与MainActivity关联
        setContentView(R.layout.activity_main3);

        bt1=(Button) findViewById(R.id.button_next3);
        mContext = this;
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,Main4Activity.class);
                startActivity(intent);
            }
        });


    }
}
