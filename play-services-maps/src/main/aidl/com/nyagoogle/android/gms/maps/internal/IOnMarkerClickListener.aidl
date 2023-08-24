package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.maps.model.internal.IMarkerDelegate;

interface IOnMarkerClickListener {
    boolean onMarkerClick(IMarkerDelegate marker);
}
