package com.example.shakeddromi.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView photo;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        photo=(ImageView) findViewById(R.id.photo);
    }

    public void click(View view) {
        Random rnd=new Random();
        num=rnd.nextInt(3)+1;
        if(num==1){
            photo.setImageResource(R.drawable.winter1);
            btn.setText("1");
        }
        else{
            if(num==2) {
                photo.setImageResource(R.drawable.fall2);
                btn.setText("2");
            }
               else{
                    if (num==3){
                        photo.setImageResource(R.drawable.spring3);
                        btn.setText("3");
                    }

               }
        }

    }
}