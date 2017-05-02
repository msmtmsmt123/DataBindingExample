package com.huangyu.databindingexample.layout_details;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.huangyu.databindingexample.R;
import com.huangyu.databindingexample.bean.User;
import com.huangyu.databindingexample.databinding.ActivityLayoutDetailsBinding;

/**
 * Created by huangyu on 2017-5-2.
 */
public class LayoutDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLayoutDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout_details);
        User user = new User("firstName", "lastName");
        user.setAdult(false);
        binding.setUser(user);
    }

}
