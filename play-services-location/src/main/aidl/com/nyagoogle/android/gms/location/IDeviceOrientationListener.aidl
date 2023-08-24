package com.nyagoogle.android.gms.location;

import com.nyagoogle.android.gms.location.DeviceOrientation;

interface IDeviceOrientationListener {
    oneway void onDeviceOrientationChanged(in DeviceOrientation deviceOrientation);
}
