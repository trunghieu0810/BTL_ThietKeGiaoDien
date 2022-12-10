package com.example.thietkegiaodien.basic;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;

public class CustomListVIewActivity extends AppCompatActivity {

    //Các hình ảnh của từng Item trong ListView
    public static int[] imgAvatar = {R.drawable.chu_b, R.drawable.chu_b,
            R.drawable.con_cho, R.drawable.chua, R.drawable.con_trau, R.drawable.con_voi,
            R.drawable.chucai, R.drawable.con_ga, R.drawable.convat, R.drawable.con_trau,
            R.drawable.con_cho, R.drawable.chua, R.drawable.con_trau, R.drawable.con_voi,
            R.drawable.chucai, R.drawable.con_ga, R.drawable.convat, R.drawable.con_trau};
    //Nội dung của từng Item trong ListView
    public static String[] tvNoiDung = {"Sinh nhật", "Chúc mừng năm mới",
            "Valentine", "GoodMorning", "Nhà giáo Việt Nam", "Ngày Phụ nữ Việt Nam",
            "Quốc tế phụ nữ", "Chúc ngủ ngon", "Noel", "Giải trí",
            "Valentine", "GoodMorning", "Nhà giáo Việt Nam", "Ngày Phụ nữ Việt Nam",
            "Quốc tế phụ nữ", "Chúc ngủ ngon", "Noel", "Giải trí"};

    ListView lvCustomListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        //get ListView theo ID từ layout xml
        lvCustomListView = (ListView) findViewById(R.id.lvCustomListView);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        //Ở bước này mình đã làm tắt đi 1 bước, chính xác là
//        //CustomAdapter adapter=new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar);
//        //lvCustomListView.setAdapter(adapter);
       // lvCustomListView.setAdapter(new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar));
    }
}
