package com.nyagoogle.android.gms.plus.internal;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IPlusOneButtonCreator {
    IObjectWrapper create(IObjectWrapper context, int size, int annotation, String url, int activityRequestCode);
    IObjectWrapper createForAccount(IObjectWrapper context, int size, int annotation, String url, String account);
}
