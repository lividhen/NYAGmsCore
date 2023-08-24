package com.nyagoogle.android.gms.ads.internal.request;

import com.nyagoogle.android.gms.ads.internal.ExceptionParcel;

interface INonagonStreamingResponseListener {
    void onSuccess(in ParcelFileDescriptor fd);
    void onException(in ExceptionParcel exception);
}