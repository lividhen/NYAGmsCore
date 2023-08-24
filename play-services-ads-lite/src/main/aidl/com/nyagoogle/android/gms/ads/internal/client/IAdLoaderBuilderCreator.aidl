package com.nyagoogle.android.gms.ads.internal.client;

import com.nyagoogle.android.gms.ads.internal.meditation.client.IAdapterCreator;
import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IAdLoaderBuilderCreator {
    IBinder newAdLoaderBuilder(IObjectWrapper context, String adUnitId, IAdapterCreator adapterCreator, int clientVersion);
}