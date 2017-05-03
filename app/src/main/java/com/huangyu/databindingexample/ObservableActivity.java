package com.huangyu.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.huangyu.databindingexample.bean.ObservableUser;
import com.huangyu.databindingexample.databinding.ActivityObservableBinding;

/**
 * Created by huangyu on 2017-5-3.
 */
public class ObservableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        ObservableUser user = new ObservableUser();
        user.setFirstName("firstName");
        binding.setUser(user);
        binding.setHandlers(new Handlers());
    }

    public class Handlers {
        public void onClick(ObservableUser user) {
            user.setFirstName("changed");
        }
    }

}
