package com.huangyu.databindingexamle.binding_data;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.huangyu.databindingexamle.R;
import com.huangyu.databindingexamle.bean.User;
import com.huangyu.databindingexamle.databinding.ActivityBindingDataBinding;

public class BindingDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binding_data);
        ActivityBindingDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "User");
        binding.setUser(user);
    }
}
