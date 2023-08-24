package com.nyagoogle.android.gms.ads.internal.client;

import com.nyagoogle.android.gms.ads.internal.AdErrorParcel;

interface IOnAdInspectorClosedListener {
    void onAdInspectorClosed(in @nullable AdErrorParcel adErrorParcel);
}