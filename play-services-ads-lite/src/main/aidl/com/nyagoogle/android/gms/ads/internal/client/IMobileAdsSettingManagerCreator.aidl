package com.nyagoogle.android.gms.ads.internal.client;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IMobileAdsSettingManagerCreator {
    IBinder getMobileAdsSettingManager(IObjectWrapper context, int clientVersion);
}