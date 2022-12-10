package com.example.thietkegiaodien.view.convat;

import android.content.Intent;
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
import com.example.thietkegiaodien.view.ViewMainActivity;
import java.util.Locale;

public class ConVat extends AppCompatActivity {
    private Button buttonBack;
    private ImageButton buttonE;
    private ImageButton buttonD;
    private ImageButton buttonCh;
    private ImageButton buttonB;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(@Nullable Bundle savledInstanceState) {
        super.onCreate(savledInstanceState);
        setContentView(R.layout.convat_activity);

        buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConVat.this, ViewMainActivity.class);
                startActivity(intent);
            }
        });

        buttonE = (ImageButton) findViewById(R.id.imageButton);
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.con_voi,"con voi");
            }
        });

        buttonD = (ImageButton) findViewById(R.id.imageButton2);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.con_cho,"con chó");
            }
        });

        buttonCh = (ImageButton) findViewById(R.id.imageButton3);
        buttonCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConVat.this, ViewMainActivity.class);
                startActivity(intent);
            }
        });

        buttonB = (ImageButton) findViewById(R.id.imageButton4);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConVat.this, ViewMainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showDialog(int a, String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ConVat.this, R.style.AlertDialog);
        View view = LayoutInflater.from(ConVat.this).inflate(
          R.layout.dialog, findViewById(R.id.layoutDialog)
        );
        builder.setView(view);
        ImageView imageView = view.findViewById(R.id.image_con_vat);
        TextView textViewTitle = view.findViewById(R.id.textViewTitle);
        TextView textViewMess = view.findViewById(R.id.textMess);
        Button buttonOK = view.findViewById(R.id.buttonOK);
        ImageButton btnspeak = view.findViewById(R.id.btnspeak);

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
        btnspeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(ConVat.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if(status != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.ENGLISH);
                            textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });
    }
}