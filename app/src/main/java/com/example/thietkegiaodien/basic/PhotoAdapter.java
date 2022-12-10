package com.example.thietkegiaodien.basic;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.thietkegiaodien.R;

import java.util.List;

/*public class PhotoAdapter extends PagerAdapter {

    private Context mContext;
    private List<Photo>  mListPhoto;

    public PhotoAdapter(Context context, List<Photo> mListPhoto) {
        this.mContext = context;
        this.mListPhoto = mListPhoto;
    }
/*
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.hoc_chu_cai_activity, container, false);

        ImageView imgPhoto = view.findViewById(R.id.image_chu_cai);
        Photo photo = mListPhoto.get(position);
        if(photo != null) {
            Glide.with(mContext).load(photo.getResourceId()).into(imgPhoto);
        }

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        if(mListPhoto != null) {
            return mListPhoto.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }*/

