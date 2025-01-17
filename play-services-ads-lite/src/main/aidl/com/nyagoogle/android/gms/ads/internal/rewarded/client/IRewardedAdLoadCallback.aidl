package com.nyagoogle.android.gms.ads.internal.rewarded.client;

import com.nyagoogle.android.gms.ads.internal.AdErrorParcel;

interface IRewardedAdLoadCallback {
    void onAdLoaded() = 0;
    void onAdLoadErrorCode(int code) = 1;
    void onAdLoadError(in AdErrorParcel error) = 2;
}