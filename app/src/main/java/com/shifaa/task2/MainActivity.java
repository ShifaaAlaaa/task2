package com.shifaa.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button counter1,counter2,counter3,counter4;
    static int c1=90;
    static int c2=90;
    static int c3=90;
    static int c4=90;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void counter(View view) {
        counter1 = (Button) findViewById(R.id.button);

       // counter1.setText("الحمدلله");
        if (c1==0 ){
            c1=90;
        }
        counter1.setText("" + c1);
        c1--;
    }
    public void counter2(View view) {
        counter2 = (Button) findViewById(R.id.button2);


        if (c2==0 ){
            c2=90;
        }
        counter2.setText("" + c2);
        c2--;
    }
    public void counter3(View view) {
        counter3 = (Button) findViewById(R.id.button3);


        if (c3==0 ){
            c3=90;
        }
        counter3.setText("" + c3);
        c3--;
    }
    public void counter4(View view) {
        counter4 = (Button) findViewById(R.id.button4);


        if (c4==0 ){
            c4=90;
        }
        counter4.setText("" + c4);
        c4--;
    }
}
