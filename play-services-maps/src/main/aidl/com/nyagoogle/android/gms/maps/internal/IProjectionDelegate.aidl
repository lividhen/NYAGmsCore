package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;
import com.nyagoogle.android.gms.maps.model.LatLng;
import com.nyagoogle.android.gms.maps.model.VisibleRegion;

interface IProjectionDelegate {
    LatLng fromScreenLocation(IObjectWrapper obj);
    IObjectWrapper toScreenLocation(in LatLng latLng);
    VisibleRegion getVisibleRegion();
}
