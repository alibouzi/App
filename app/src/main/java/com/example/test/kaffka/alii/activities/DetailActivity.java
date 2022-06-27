package com.example.test.kaffka.alii.activities;
import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.test.kaffka.alii.R;
import com.example.test.kaffka.alii.databinding.ActivityDetailsBinding;
import com.example.test.kaffka.alii.viewmodels.Model;
import com.google.gson.Gson;
import com.example.test.kaffka.alii.models.PixabayImage;
public class DetailActivity extends AppCompatActivity {
    ActivityDetailsBinding activityDetailsBinding;
    public final static String PIXABAY_IMAGE = "PIXABAY_IMAGE";
    private PixabayImage image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_details);
        initImage();
        activityDetailsBinding.setViewmodel(new Model(image));
    }

    private void initImage() {
        image = new Gson().fromJson(getIntent().getStringExtra(PIXABAY_IMAGE), PixabayImage.class);
    }
}
