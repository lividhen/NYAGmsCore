package com.nyagoogle.android.gms.cast.framework;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface ICastStateListener {
    IObjectWrapper getWrappedThis() = 0;
    void onCastStateChanged(int newState) = 1;
    int getSupportedVersion() = 2;
}
