package com.example.thietkegiaodien.view.chucai;

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
import com.example.thietkegiaodien.view.convat.ConVat;

import java.util.Locale;

public class BangChuCai extends AppCompatActivity {

    private Button buttonBack;
    private TextToSpeech textToSpeech;
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

        buttonE = (ImageButton) findViewById(R.id.imageButtonE);
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_e, "Chữ E");
            }
        });

        buttonF = (ImageButton) findViewById(R.id.imageButtonF);
        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_e, "Chữ F");
            }
        });

        buttonE = (ImageButton) findViewById(R.id.imageButtonE);
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_f, "Chữ E");
            }
        });

        buttonG = (ImageButton) findViewById(R.id.imageButtonG);
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_g, "Chữ G");
            }
        });

        buttonH = (ImageButton) findViewById(R.id.imageButtonH);
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_h, "Chữ H");
            }
        });

        buttonI = (ImageButton) findViewById(R.id.imageButtonI);
        buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_i, "Chữ I");
            }
        });

        buttonK = (ImageButton) findViewById(R.id.imageButtonK);
        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_k, "Chữ K");
            }
        });

        buttonL = (ImageButton) findViewById(R.id.imageButtonL);
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_l, "Chữ L");
            }
        });

        buttonM = (ImageButton) findViewById(R.id.imageButtonM);
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_m, "Chữ M");
            }
        });

        buttonN = (ImageButton) findViewById(R.id.imageButtonN);
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_n, "Chữ N");
            }
        });

        buttonO = (ImageButton) findViewById(R.id.imageButtonO);
        buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_o, "Chữ O");
            }
        });

        buttonP = (ImageButton) findViewById(R.id.imageButtonP);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_p, "Chữ P");
            }
        });

        buttonQ = (ImageButton) findViewById(R.id.imageButtonQ);
        buttonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_q, "Chữ Q");
            }
        });

        buttonR = (ImageButton) findViewById(R.id.imageButtonR);
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_r, "Chữ R");
            }
        });

        buttonS = (ImageButton) findViewById(R.id.imageButtonS);
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_s, "Chữ S");
            }
        });

        buttonT = (ImageButton) findViewById(R.id.imageButtonT);
        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_t, "Chữ T");
            }
        });

        buttonU = (ImageButton) findViewById(R.id.imageButtonU);
        buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_u, "Chữ U");
            }
        });

        buttonV = (ImageButton) findViewById(R.id.imageButtonV);
        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_v, "Chữ V");
            }
        });

        buttonW = (ImageButton) findViewById(R.id.imageButtonW);
        buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_w, "Chữ W");
            }
        });

        buttonX = (ImageButton) findViewById(R.id.imageButtonX);
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_x, "Chữ X");
            }
        });

        buttonY = (ImageButton) findViewById(R.id.imageButtonY);
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialog(R.drawable.chu_y, "Chữ Y"); }
        });

        buttonZ = (ImageButton) findViewById(R.id.imageButtonZ);
        buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(R.drawable.chu_z, "Chữ Z ");
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
        ImageButton btnspeak = view.findViewById(R.id.btnspeak);

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
                textToSpeech = new TextToSpeech(BangChuCai.this, new TextToSpeech.OnInitListener() {
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
