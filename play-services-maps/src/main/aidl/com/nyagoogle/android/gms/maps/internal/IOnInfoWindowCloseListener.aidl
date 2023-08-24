package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.maps.model.internal.IMarkerDelegate;

interface IOnInfoWindowCloseListener {
    void onInfoWindowClose(IMarkerDelegate marker);
}
