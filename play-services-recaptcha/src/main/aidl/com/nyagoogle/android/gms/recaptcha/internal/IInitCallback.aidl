package com.nyagoogle.android.gms.recaptcha.internal;

import com.nyagoogle.android.gms.common.api.Status;

import com.nyagoogle.android.gms.recaptcha.RecaptchaHandle;
import com.nyagoogle.android.gms.recaptcha.internal.InitResults;

interface IInitCallback {
    oneway void onHandle(in Status status, in RecaptchaHandle handle) = 0;
    oneway void onResults(in Status status, in InitResults results) = 1;
}
