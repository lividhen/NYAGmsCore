package com.nyagoogle.android.gms.auth.api.phone.internal;

import com.nyagoogle.android.gms.common.api.Status;

interface ISmsRetrieverResultCallback {
    void onResult(in Status status) = 0;
}
