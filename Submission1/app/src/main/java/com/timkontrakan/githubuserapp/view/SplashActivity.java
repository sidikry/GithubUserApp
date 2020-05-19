package com.timkontrakan.githubuserapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.timkontrakan.githubuserapp.R;
import com.timkontrakan.githubuserapp.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    Animation animation_logo, animation_bottom_to_top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.timkontrakan.githubuserapp.databinding.ActivitySplashBinding binding = ActivitySplashBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        animation_logo = AnimationUtils.loadAnimation(this, R.anim.app_logo_splash);
        animation_bottom_to_top = AnimationUtils.loadAnimation(this, R.anim.bottom_top);

        binding.iconLogo.startAnimation(animation_logo);
        binding.iconName.startAnimation(animation_bottom_to_top);

        move();
    }

    private void move() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }
}
