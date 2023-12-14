package com.example.tarkov.ui.dashboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tarkov.R;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
public class MapOfBeregActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_of_bereg);

        SubsamplingScaleImageView imageView = findViewById(R.id.mapImageView);
        imageView.setImage(ImageSource.resource(R.drawable.map_of_bereg));
    }
}