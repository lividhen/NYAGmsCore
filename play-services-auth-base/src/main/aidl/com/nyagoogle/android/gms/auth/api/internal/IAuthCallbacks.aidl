package com.nyagoogle.android.gms.auth.api.internal;

import com.nyagoogle.android.gms.auth.api.proxy.ProxyResponse;

interface IAuthCallbacks {
    void onProxyResponse(in ProxyResponse response) = 0;
    void onSpatulaHeader(String spatulaHeader) = 1;
}
