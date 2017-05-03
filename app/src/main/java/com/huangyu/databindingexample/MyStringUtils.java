package com.huangyu.databindingexample;

/**
 * Created by huangyu on 2017-5-3.
 */
public class MyStringUtils {

    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }

}
