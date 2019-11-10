package com.thohao.databinding_simple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.thohao.databinding_simple.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //sử dụng binding
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        user=new User("Test","User");
        user.setFirstname("Hào");
        user.setLastname("Uyen");
        binding.setUser(user);

    }
}
