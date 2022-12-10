package com.example.thietkegiaodien.view.chucai;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.view.ViewMainActivity;
import com.example.thietkegiaodien.view.convat.ConVat;

public class BangChuCai extends AppCompatActivity {

    private Button buttonBack;
    private ImageButton buttonA;
    private ImageButton buttonB;
    private ImageButton buttonC;
    private ImageButton buttonD;
    private ImageButton buttonE;
    private ImageButton buttonF;
    private ImageButton buttonG;
    private ImageButton buttonH;
    private ImageButton buttonI;
    private ImageButton buttonK;
    private ImageButton buttonL;
    private ImageButton buttonM;
    private ImageButton buttonN;
    private ImageButton buttonO;
    private ImageButton buttonP;
    private ImageButton buttonQ;
    private ImageButton buttonR;
    private ImageButton buttonS;
    private ImageButton buttonT;
    private ImageButton buttonU;
    private ImageButton buttonV;
    private ImageButton buttonW;
    private ImageButton buttonX;
    private ImageButton buttonY;
    private ImageButton buttonZ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bang_chu_cai);

        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BangChuCai.this, ChuCai.class);
                startActivity(intent);
            }
        });

        buttonA = (ImageButton) findViewById(R.id.imageButtonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_a, "Chữ A");
            }
        });

        buttonB = (ImageButton) findViewById(R.id.imageButtonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_b, "Chữ B");
            }
        });

        buttonC = (ImageButton) findViewById(R.id.imageButtonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_c, "Chữ C");
            }
        });

        buttonD = (ImageButton) findViewById(R.id.imageButtonD);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_d, "Chữ D");
            }
        });

        buttonM = (ImageButton) findViewById(R.id.imageButtonM);
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_a, "Chữ M");
            }
        });

        buttonX = (ImageButton) findViewById(R.id.imageButtonX);
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_a, "Chữ X");
            }
        });
    }

    private void showDialog(int a, String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(BangChuCai.this, R.style.AlertDialog);
        View view = LayoutInflater.from(BangChuCai.this).inflate(
                R.layout.dialog, findViewById(R.id.layoutDialog)
        );
        builder.setView(view);
        ImageView imageView = view.findViewById(R.id.image_con_vat);
        TextView textViewTitle = view.findViewById(R.id.textViewTitle);
        TextView textViewMess = view.findViewById(R.id.textMess);
        Button buttonOK = view.findViewById(R.id.buttonOK);

        textViewMess.setText(s);
        textViewTitle.setText(s);
        buttonOK.setText("OK");

        imageView.setImageResource(a);

        AlertDialog alertDialog = builder.create();

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }

}
