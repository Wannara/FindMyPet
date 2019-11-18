package com.example.findmypet.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.findmypet.Adapter.SlideAdapter;
import com.example.findmypet.R;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideAdapter slideAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);

        // view adapter
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        slideAdapter = new SlideAdapter(this);
        viewPager.setAdapter(slideAdapter);
    }
}
