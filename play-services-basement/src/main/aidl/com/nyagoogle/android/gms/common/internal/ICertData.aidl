package com.nyagoogle.android.gms.common.internal;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface ICertData {
    IObjectWrapper getWrappedBytes();
    int remoteHashCode();
}