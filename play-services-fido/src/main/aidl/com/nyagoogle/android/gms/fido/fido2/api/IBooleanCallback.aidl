package com.nyagoogle.android.gms.fido.fido2.api;

import com.nyagoogle.android.gms.common.api.Status;

interface IBooleanCallback {
    void onBoolean(boolean value) = 0;
    void onError(in Status status) = 1;
}
