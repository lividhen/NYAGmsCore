package com.nyagoogle.android.gms.location.internal;

import android.location.Location;
import com.nyagoogle.android.gms.common.api.Status;

interface ILocationStatusCallback {
    void onLocationStatus(in Status status, in Location location);
}
