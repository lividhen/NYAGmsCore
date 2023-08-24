package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.maps.internal.IGoogleMapDelegate;

interface IOnMapReadyCallback {
    void onMapReady(IGoogleMapDelegate map);
}
