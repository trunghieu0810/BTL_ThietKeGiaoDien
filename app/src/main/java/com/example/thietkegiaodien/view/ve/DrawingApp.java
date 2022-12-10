package com.example.thietkegiaodien.view.ve;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.view.ViewMainActivity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


    public class DrawingApp extends AppCompatActivity {

        private ImageView imageView;
        private Button buttonBack;

        private float floatStartX = -1, floatStartY = -1,
                floatEndX = -1, floatEndY = -1;

        private Bitmap bitmap;
        private Canvas canvas;
        private Paint paint = new Paint();


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.drawing_activity);
            buttonBack = (Button) findViewById(R.id.button_back);
            buttonBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DrawingApp.this, ViewMainActivity.class);
                    startActivity(intent);
                }
            });
//            ActivityCompat.requestPermissions(this
//                    ,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
//                            Manifest.permission.WRITE_EXTERNAL_STORAGE},
//                    PackageManager.PERMISSION_GRANTED);

            imageView = findViewById(R.id.imageView);
        }

        private void drawPaintSketchImage(){

            if (bitmap == null){
                bitmap = Bitmap.createBitmap(imageView.getWidth(),
                        imageView.getHeight(),
                        Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bitmap);
                paint.setColor(Color.WHITE);
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(8);
            }
            canvas.drawLine(floatStartX,
                    floatStartY-220,
                    floatEndX,
                    floatEndY-220,
                    paint);
            imageView.setImageBitmap(bitmap);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN){
                floatStartX = event.getX();
                floatStartY = event.getY();
            }

            if (event.getAction() == MotionEvent.ACTION_MOVE){
                floatEndX = event.getX();
                floatEndY = event.getY();
                drawPaintSketchImage();
                floatStartX = event.getX();
                floatStartY = event.getY();
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                floatEndX = event.getX();
                floatEndY = event.getY();
                drawPaintSketchImage();
            }
            return super.onTouchEvent(event);
        }
    }
