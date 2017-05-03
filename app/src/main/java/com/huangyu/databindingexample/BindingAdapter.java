package com.huangyu.databindingexample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.huangyu.databindingexample.databinding.GridviewItemBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangyu on 2017-5-3.
 */
public class BindingAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<String> mlist;

    public BindingAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        mlist = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mlist.add(i, "item" + i);
        }
    }

    @Override
    public int getCount() {
        return mlist == null ? 0 : mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridviewItemBinding binding;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.gridview_item, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (GridviewItemBinding) convertView.getTag();
        }
        binding.setVariable(com.huangyu.databindingexample.BR.item, mlist.get(position));
        binding.setAdapter(this);
        return convertView;
    }

}
