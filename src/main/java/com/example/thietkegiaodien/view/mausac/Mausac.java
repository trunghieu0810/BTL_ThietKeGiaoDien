package com.example.thietkegiaodien.view.mausac;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.basic.CustomAdapter;
import com.example.thietkegiaodien.view.ViewMainActivity;
import com.example.thietkegiaodien.view.chucai.BangChuCai;
import com.example.thietkegiaodien.view.chucai.ChuCai;
import com.example.thietkegiaodien.view.convat.ConVat;
import com.example.thietkegiaodien.view.sodem.SoDem;

import java.util.ArrayList;
import java.util.Locale;

public class Mausac extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private Button buttonBack;
    private ArrayList<CustomAdapter> list;
    private TextToSpeech textToSpeech;

    public static int[] imgAvatar = {R.drawable.so1, R.drawable.so2,
            R.drawable.so3, R.drawable.so4, R.drawable.so5, R.drawable.so6,
            R.drawable.so7, R.drawable.so8, R.drawable.so9, R.drawable.so10};
    //Nội dung của từng Item trong ListView
    public static String[] tvNoiDung = {"Số một", "Số hai",
            "Số ba", "Số bốn", "Số năm", "Số sáu",
            "Số bảy", "Số tám", "Số chín", "Số mười"};

    ListView lvCustomListView;
    @Override
    protected void onCreate(@Nullable Bundle savledInstanceState) {
        super.onCreate(savledInstanceState);
        setContentView(R.layout.mausac_activity);
        //get ListView theo ID từ layout xml
        lvCustomListView = (ListView) findViewById(R.id.lvCustomListView);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        CustomAdapter customAdapter = new CustomAdapter(Mausac.this,tvNoiDung,imgAvatar);
        lvCustomListView.setAdapter(customAdapter);
        lvCustomListView.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        list.add(customAdapter);


        buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mausac.this, ViewMainActivity.class);
                startActivity(intent);
            }
        });
}

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        showDialog(imgAvatar[i], String.valueOf(tvNoiDung));
    }

    private void showDialog(int a, String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Mausac.this, R.style.AlertDialog);
        View view = LayoutInflater.from(Mausac.this).inflate(
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

        btnspeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(Mausac.this, new TextToSpeech.OnInitListener() {
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

        if(alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }

}
