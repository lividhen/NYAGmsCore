package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;
import com.nyagoogle.android.gms.maps.model.internal.IMarkerDelegate;

interface IInfoWindowAdapter {
    IObjectWrapper getInfoWindow(IMarkerDelegate marker);
    IObjectWrapper getInfoContents(IMarkerDelegate marker);
}
