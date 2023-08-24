package com.nyagoogle.android.gms.maps.internal;

import android.location.Location;

interface IOnLocationChangeListener {
    void onLocationChanged(in Location location) = 1;
}
