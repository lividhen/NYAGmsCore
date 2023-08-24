package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.maps.model.CameraPosition;

interface IOnCameraChangeListener {
    void onCameraChange(in CameraPosition update);
}
