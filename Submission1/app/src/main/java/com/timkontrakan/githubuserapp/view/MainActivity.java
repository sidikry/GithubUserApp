package com.timkontrakan.githubuserapp.view;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.timkontrakan.githubuserapp.adapter.UserAdapter;
import com.timkontrakan.githubuserapp.data.UserData;
import com.timkontrakan.githubuserapp.databinding.ActivityMainBinding;
import com.timkontrakan.githubuserapp.model.User;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        layoutManager = new LinearLayoutManager(this);
        binding.rvUser.setLayoutManager(layoutManager);
        getData();
    }

    private void getData() {
        userArrayList= new ArrayList<>();
        userArrayList.addAll(UserData.getUserData());
        UserAdapter userAdapter = new UserAdapter(userArrayList, MainActivity.this);
        binding.rvUser.setAdapter(userAdapter);

        userAdapter.setOnItemClickListener(new UserAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, MainDetailActivity.class);
                intent.putExtra("user_name", userArrayList.get(position));
                startActivity(intent);
                finish();
            }
        });
    }

}
