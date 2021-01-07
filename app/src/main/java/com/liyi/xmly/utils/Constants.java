package com.liyi.xmly.utils;

import android.Manifest;

public class Constant {
    //权限
    public final static String[] PERMISSION = new String[]{
            Manifest.permission.INTERNET,
            Manifest.permission.ACCESS_WIFI_STATE,
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.CHANGE_NETWORK_STATE,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.FOREGROUND_SERVICE,
    };
}
