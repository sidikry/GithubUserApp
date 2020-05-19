package com.timkontrakan.githubuserapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.timkontrakan.githubuserapp.databinding.ActivityMainDetailBinding;
import com.timkontrakan.githubuserapp.model.User;

public class MainDetailActivity extends AppCompatActivity {

    private ActivityMainDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        receiveData();


    }

    public void receiveData(){
        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user_name");

        assert user != null;
        String username = user.getUsername();
        binding.username.setText(username);

        String address = user.getAddress();
        binding.address.setText(address);

        String name = user.getName();
        binding.name.setText(name);

        int avatar = user.getAvatar();
        binding.avatar.setImageResource(avatar);

        String following = user.getFollowing();
        binding.sumFollowing.setText(following);

        String followers = user.getFollowers();
        binding.sumFollowers.setText(followers);

        String about = user.getAboutme();
        binding.aboutMe.setText(about);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MainDetailActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
