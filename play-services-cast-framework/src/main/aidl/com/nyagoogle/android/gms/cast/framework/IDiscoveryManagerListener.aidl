package com.nyagoogle.android.gms.cast.framework;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IDiscoveryManagerListener {
    IObjectWrapper getWrappedThis() = 0;
    void onDeviceAvailabilityChanged(boolean deviceAvailable) = 1;
}
