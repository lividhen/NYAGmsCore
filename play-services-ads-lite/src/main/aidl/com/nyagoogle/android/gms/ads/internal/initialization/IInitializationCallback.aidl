package com.nyagoogle.android.gms.ads.internal.initialization;

import com.nyagoogle.android.gms.ads.internal.AdapterStatusParcel;

interface IInitializationCallback {
    void onInitialized(in List<AdapterStatusParcel> status);
}