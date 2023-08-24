package com.nyagoogle.android.gms.recaptcha.internal;

import com.nyagoogle.android.gms.common.api.Status;

interface ICloseCallback {
    oneway void onClosed(in Status status, boolean closed) = 0;
}
