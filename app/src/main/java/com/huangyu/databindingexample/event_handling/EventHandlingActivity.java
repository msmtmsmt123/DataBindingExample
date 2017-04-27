package com.huangyu.databindingexample.event_handling;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.huangyu.databindingexample.R;
import com.huangyu.databindingexample.bean.User;
import com.huangyu.databindingexample.databinding.ActivityEventHandlingBinding;

public class EventHandlingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEventHandlingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_event_handling);
        binding.setHandlers(new Handlers());
        User user = new User("MethodReference", "ListenerBindings");
        binding.setUser(user);
    }

    public class Handlers {
        public void methodReference(View view) {
            Toast.makeText(EventHandlingActivity.this, "methodReference", Toast.LENGTH_SHORT).show();
        }

        public void listenerBindings(View view) {
            Toast.makeText(EventHandlingActivity.this, "listenerBindings", Toast.LENGTH_SHORT).show();
        }
    }

}
