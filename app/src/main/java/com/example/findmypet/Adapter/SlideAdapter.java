package com.example.findmypet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.findmypet.R;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public SlideAdapter (Context context){
        this.context = context;
    }


    // list of image
    public int[] lst_image = {
            R.drawable.dogview1,
            R.drawable.dog_home,
            R.drawable.handview2
    };

    // list of title
    public String[] lst_title = {
             "เลื่อนไปทางขวา",
            "เลื่อนไปทางขวาอีก",
            "เลื่อนไปทางขวาอีกกก"
    };

    // list of background
    public int[] lst_bg = {
            R.drawable.yellow,
            R.drawable.purple,
            R.drawable.red
    };


    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.silde, container, false);

        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slideView);
        ImageView imageslide  = (ImageView) view.findViewById(R.id.img_view);
        TextView title = (TextView) view.findViewById(R.id.title_tv);

        layoutslide.setBackgroundColor(lst_bg[position]);
        imageslide.setImageResource(lst_image[position]);
        title.setText(lst_title[position]);

        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
