package com.nyagoogle.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IBitmapDescriptorFactoryDelegate {
    IObjectWrapper fromResource(int resourceId);
    IObjectWrapper fromAsset(String assetName);
    IObjectWrapper fromFile(String fileName);
    IObjectWrapper defaultMarker();
    IObjectWrapper defaultMarkerWithHue(float hue);
    IObjectWrapper fromBitmap(in Bitmap bitmap);
    IObjectWrapper fromPath(String absolutePath);
}
