package com.nyagoogle.android.gms.appdatasearch.internal;

import com.nyagoogle.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.nyagoogle.android.gms.appdatasearch.UsageInfo;

interface ILightweightAppDataSearch {
    void view(ILightweightAppDataSearchCallbacks callbacks, String packageName, in UsageInfo[] usageInfos);
}
