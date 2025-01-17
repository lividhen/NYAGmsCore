package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.maps.internal.IOnLocationChangeListener;

interface ILocationSourceDelegate {
    void activate(IOnLocationChangeListener listener) = 0;
    void deactivate() = 1;
}
