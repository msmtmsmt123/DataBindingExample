package com.huangyu.databindingexample.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.huangyu.databindingexample.BR;


/**
 * Created by huangyu on 2017-5-3.
 */
public class ObservableUser extends BaseObservable {

    private String firstName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

}
