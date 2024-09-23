package com.demo.demoandroidimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class fruit_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_detail);

        // get parameters
        //
        Intent intent = getIntent();
        String touristImg = intent.getStringExtra("touristImg");


        // ตัดสินใจว่าจะนำรูปใดมาแสดง ขึ้นกันค่า fruitImg ที่รับมา
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String Desc = null;
        switch (touristImg){
            case "tourist1": imageView.setImageResource(R.drawable.tourist_spot1);
                Desc = getString(R.string.tourist_spot1_desc);
                break;
            case "tourist2": imageView.setImageResource(R.drawable.tourist_spot2);
                Desc = getString(R.string.tourist_spot2_desc);
                break;
            case "tourist3": imageView.setImageResource(R.drawable.tourist_spot3);
                Desc = getString(R.string.tourist_spot3_desc);
                break;
            case "tourist4": imageView.setImageResource(R.drawable.tourist_spot4);
                Desc = getString(R.string.tourist_spot4_desc);
                break;
//            case "strawberry": imageView.setImageResource(R.drawable.strawberry); break;
            default: imageView.setImageResource(R.drawable.tourist_spot4);
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Desc);

    }
}
