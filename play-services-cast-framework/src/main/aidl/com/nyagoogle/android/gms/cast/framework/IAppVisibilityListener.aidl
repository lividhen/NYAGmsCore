package com.nyagoogle.android.gms.cast.framework;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IAppVisibilityListener {
    IObjectWrapper getThisObject() = 0;
    void onAppEnteredForeground() = 1;
    void onAppEnteredBackground() = 2;
    int getSupportedVersion() = 3;
}