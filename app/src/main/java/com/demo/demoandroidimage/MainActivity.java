package com.demo.demoandroidimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // new ScrollView & LinearLayout
        //
//        ScrollView scrollView = new ScrollView(this);
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        scrollView.setLayoutParams(layoutParams);
//
//        LinearLayout linearLayout = new LinearLayout(this);
//        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        linearLayout.setLayoutParams(linearParams);
//
//        scrollView.addView(linearLayout);

        // new image : guava
        //
//        final ImageView imageView1 = new ImageView(this);
//        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        params1.setMargins(0, 30, 0, 30);
//        params1.gravity = Gravity.CENTER;
//        imageView1.setLayoutParams(params1);
//        imageView1.setImageDrawable(getResources().getDrawable(R.drawable.guava));
//        imageView1.setImageResource(R.drawable.guava);

//        Resources resources = getResources();
//        imageView1.setImageDrawable(resources.getDrawable(R.drawable.guava));

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);

//        imageView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast toast = Toast.makeText(getApplicationContext(),
//                        "ฝรั่ง",
//                        Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fruit_detail.class);
                intent.putExtra("touristImg", "tourist1");
                startActivity(intent);
            }
        });

        // new image : jackfruit => durian
        //
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fruit_detail.class);
                intent.putExtra("touristImg", "tourist2");
                startActivity(intent);
            }
        });

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fruit_detail.class);
                intent.putExtra("touristImg", "tourist3");
                startActivity(intent);
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fruit_detail.class);
                intent.putExtra("touristImg", "tourist4");
                startActivity(intent);
            }
        });

//        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
//
//        imageView5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, fruit_detail.class);
//                intent.putExtra("fruitName", "สตรอเบอรี่");
//                intent.putExtra("fruitImg", "strawberry");
//                startActivity(intent);
//            }
//        });

    }
}
