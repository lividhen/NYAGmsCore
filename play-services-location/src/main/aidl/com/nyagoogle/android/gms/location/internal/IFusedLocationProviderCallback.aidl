package com.nyagoogle.android.gms.location.internal;

import com.nyagoogle.android.gms.location.internal.FusedLocationProviderResult;

interface IFusedLocationProviderCallback {
    oneway void onFusedLocationProviderResult(in FusedLocationProviderResult result) = 0;
    oneway void cancel() = 1;
}
