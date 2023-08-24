package com.nyagoogle.android.gms.maps.internal;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;
import android.graphics.Bitmap;

interface ISnapshotReadyCallback {
    void onBitmapReady(in Bitmap bitmap);
    void onBitmapWrappedReady(IObjectWrapper wrapper);
}
