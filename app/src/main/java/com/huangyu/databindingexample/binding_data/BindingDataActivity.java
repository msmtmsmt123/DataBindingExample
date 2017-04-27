package com.huangyu.databindingexample.binding_data;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.huangyu.databindingexample.R;
import com.huangyu.databindingexample.bean.User;
import com.huangyu.databindingexample.databinding.ActivityBindingDataBinding;

public class BindingDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_data);
        User user = new User("BindingData", "User");
        binding.setUser(user);
    }
}
