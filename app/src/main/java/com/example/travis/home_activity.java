package com.example.travis;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.travis.controller.imageConverter;

public class home_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.avt);
        Bitmap circularBitmap = imageConverter.getRoundedCornerBitmap(bitmap, 100);

        ImageView circularImageView = (ImageView) findViewById(R.id.img_avt);
        circularImageView.setImageBitmap(circularBitmap);

    }
}
