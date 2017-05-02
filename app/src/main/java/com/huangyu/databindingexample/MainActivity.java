package com.huangyu.databindingexample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.huangyu.databindingexample.binding_data.BindingDataActivity;
import com.huangyu.databindingexample.databinding.ActivityMainBinding;
import com.huangyu.databindingexample.event_handling.EventHandlingActivity;
import com.huangyu.databindingexample.layout_details.LayoutDetailsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandlers(new Handlers());
    }

    private void toNextActivity(Class<?> clazz) {
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
    }

    public class Handlers {
        public void bindData() {
            toNextActivity(BindingDataActivity.class);
        }

        public void eventHandling() {
            toNextActivity(EventHandlingActivity.class);
        }

        public void layoutDetails() {
            toNextActivity(LayoutDetailsActivity.class);
        }
    }

}
