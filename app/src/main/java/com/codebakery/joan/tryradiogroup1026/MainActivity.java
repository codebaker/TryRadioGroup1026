package com.codebakery.joan.tryradiogroup1026;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String text = "CheckedId : " + checkedId;
                MainActivity main =(MainActivity)group.getContext();
                Context app = (Context) getApplicationContext();
                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();

                //getApplicationContext() => App 전체를 가져온다.리소스를 많이 먹음
                //Toast.makeText(Context context, CharSequence text, @Duration int duration) 의
                //view.getContext() 하면 view의 Context...즉 MainActivity를 가리킴.
            }
        });
    }
}
