package com.huangyu.databindingexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

/**
 * Created by huangyu on 2017-5-3.
 */
public class BindingAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binding_adapter);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        BindingAdapter adapter = new BindingAdapter(this);
        gridView.setAdapter(adapter);
    }

}
