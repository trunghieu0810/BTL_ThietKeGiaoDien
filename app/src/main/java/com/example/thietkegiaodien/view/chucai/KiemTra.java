package com.example.thietkegiaodien.view.chucai;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
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
import com.example.thietkegiaodien.view.convat.ConVat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class KiemTra extends AppCompatActivity {
    public static int[] img = {R.drawable.a, R.drawable.b,
            R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
            R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.k};

    public static String[] noiDung = {"Chữ A", "Chữ B",
            "Chữ C", "Chữ D", "Chữ E", "Chữ F",
            "Chữ G", "Chữ H", "Chữ I", "Chữ K"};

    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;

    private ImageView imageView;

    private List<Cauhoi> list = new ArrayList<>();

    private void showAlert(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(KiemTra.this, R.style.AlertDialog);
        View view = LayoutInflater.from(KiemTra.this).inflate(
                R.layout.alert, findViewById(R.id.layoutAlert)
        );
        builder.setView(view);

        TextView textViewTitle = view.findViewById(R.id.textViewTitle);
                Button buttonOK = view.findViewById(R.id.buttonOK);


        textViewTitle.setText(s);
        buttonOK.setText("OK");



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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kiemtra_activity);


        for(int i = 0;  i < 10; i++){
            Random random = new Random();
            int ranNum = random.nextInt(7);
            Cauhoi cauhoi = new Cauhoi();
            cauhoi.setNoidung(img[ranNum]);
            cauhoi.setDapan1(noiDung[ranNum]);
            cauhoi.setDapan2(noiDung[ranNum+1]);
            cauhoi.setDapan3(noiDung[ranNum+2]);
            cauhoi.setDapan4(noiDung[ranNum+3]);
            list.add(cauhoi);
        }
        Random random = new Random();
        int ranNum = random.nextInt(10);

        imageView = findViewById(R.id.image);
        imageView.setImageResource(list.get(ranNum).getNoidung());

        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);

        buttonA.setText(list.get(ranNum).getDapan1());
        buttonB.setText(list.get(ranNum).getDapan2());
        buttonC.setText(list.get(ranNum).getDapan3());
        buttonD.setText(list.get(ranNum).getDapan4());

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showAlert("Đúng");
                Random random = new Random();
                int ranNum = random.nextInt(10);
                imageView.setImageResource(list.get(ranNum).getNoidung());
                buttonA.setText(list.get(ranNum).getDapan1());
                buttonB.setText(list.get(ranNum).getDapan2());
                buttonC.setText(list.get(ranNum).getDapan3());
                buttonD.setText(list.get(ranNum).getDapan4());
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert("Sai");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert("Sai");
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert("Sai");
            }
        });


    }
}
