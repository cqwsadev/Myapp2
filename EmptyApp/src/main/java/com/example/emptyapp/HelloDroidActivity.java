package com.example.emptyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloDroidActivity extends AppCompatActivity {
        private TextView message;
        private int counter = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //把文本框的id存储在message中
            message = findViewById(R.id.clickCounter);
            //把图片的id存在droid中
            ImageView droid = findViewById(R.id.imageView3);

            //Define and attach click listener
            // 在droid图片上设置点击监听器
            droid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tapDroid();
                }
            });
        }

        private void tapDroid() {
            counter++;
            String countAsText;
            /*
             * In real applications you should not write switch like the one below.
             * Use resource of type "Quantity strings (plurals)" instead.
             * See https://developer.android.com/guide/topics/resources/string-resource#Plurals
             */
            switch (counter) {
                case 1:
                    countAsText = "once.";
                    break;
                case 2:
                    countAsText = "twice.";
                    break;
                default:
                    countAsText = String.format("%d times, stop!", counter);
            }
            message.setText(String.format("Hey, You touched me %s ", countAsText));
        }
    }


/*
    @Override
    protected void onCreate(Bundle savedInstanceState) { //创建一个界面
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //创建一个文本对象 R.res里面的路径
    }

 */