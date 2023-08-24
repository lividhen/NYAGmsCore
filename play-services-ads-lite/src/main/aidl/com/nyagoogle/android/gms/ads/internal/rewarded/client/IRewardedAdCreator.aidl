package com.nyagoogle.android.gms.ads.internal.rewarded.client;

import com.nyagoogle.android.gms.ads.internal.meditation.client.IAdapterCreator;
import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IRewardedAdCreator {
    IBinder newRewardedAd(IObjectWrapper context, String str, IAdapterCreator adapterCreator, int clientVersion);
}