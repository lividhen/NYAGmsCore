package com.nyagoogle.android.gms.auth.api.phone.internal;

import com.nyagoogle.android.gms.common.api.Status;

interface IOngoingSmsRequestCallback {
    void onHasOngoingSmsRequestResult(in Status status, boolean hasOngoingSmsRequest) = 0;
}
