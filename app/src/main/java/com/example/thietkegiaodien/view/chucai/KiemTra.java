package com.example.thietkegiaodien.view.chucai;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;

import java.util.Random;

public class KiemTra extends AppCompatActivity {
    public static int[] img = {R.drawable.a, R.drawable.b,
            R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.k};

    Random random = new Random();
    int ranNum = random.nextInt(10);
private ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kiemtra_activity);

        imageView = findViewById(R.id.image);
        imageView.setImageResource(img[ranNum]);

    }
}
