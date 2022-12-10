package com.example.thietkegiaodien.view.chucai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.TKGiaoDienActivity;
import com.example.thietkegiaodien.view.ViewMainActivity;

public class ChuCai extends AppCompatActivity {

    private Button buttonHocTap;
    private Button buttonBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chucai_activity);
        buttonHocTap = (Button) findViewById(R.id.button_bang);
        buttonBack = (Button) findViewById(R.id.button_hoc_tap);

        buttonHocTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChuCai.this, BangChuCai.class);
                startActivity(intent);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChuCai.this, ViewMainActivity.class);
                startActivity(intent);
            }
        });

    }

}