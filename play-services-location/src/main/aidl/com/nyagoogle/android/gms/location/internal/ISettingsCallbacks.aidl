package com.nyagoogle.android.gms.location.internal;

import com.nyagoogle.android.gms.location.LocationSettingsResult;

interface ISettingsCallbacks {
    void onLocationSettingsResult(in LocationSettingsResult result);
}
