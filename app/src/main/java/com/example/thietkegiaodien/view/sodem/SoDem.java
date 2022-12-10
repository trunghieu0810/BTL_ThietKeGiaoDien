package com.example.thietkegiaodien.view.sodem;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.basic.CustomAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SoDem extends AppCompatActivity {
    private TextToSpeech textToSpeech;

    //Các hình ảnh của từng Item trong ListView
    public static int[] imgAvatar = {R.drawable.so1, R.drawable.so2,
            R.drawable.so3, R.drawable.so4, R.drawable.so5, R.drawable.so6,
            R.drawable.so7, R.drawable.so8, R.drawable.so9, R.drawable.so10};
    //Nội dung của từng Item trong ListView
    public static String[] tvNoiDung = {"Số một", "Số hai",
            "Số ba", "Số bốn", "Số năm", "Số sáu",
            "Số bảy", "Số tám", "Số chín", "Số mười"};

    ListView lvCustomListView;

    private void showDialog(int a, String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SoDem.this, R.style.AlertDialog);
        View view = LayoutInflater.from(SoDem.this).inflate(
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
                textToSpeech = new TextToSpeech(SoDem.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if(status != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.forLanguageTag("vi-VN"));
                            textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.so_dem_activity);
        //get ListView theo ID từ layout xml
        lvCustomListView = (ListView) findViewById(R.id.lvCustomListView);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        CustomAdapter adapter = new CustomAdapter(SoDem.this, tvNoiDung, imgAvatar);
        lvCustomListView.setAdapter(adapter);
        //lvCustomListView.setAdapter(new CustomAdapter(SoDem.this, tvNoiDung, imgAvatar));
        List<Adapter> list = new ArrayList<>();
        list.add(adapter);

        lvCustomListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    showDialog(imgAvatar[i], tvNoiDung[i]);
            }
        });
    }
}
