package com.nyagoogle.android.gms.recaptcha.internal;

import com.nyagoogle.android.gms.common.api.Status;

import com.nyagoogle.android.gms.recaptcha.RecaptchaResultData;
import com.nyagoogle.android.gms.recaptcha.internal.ExecuteResults;

interface IExecuteCallback {
    oneway void onData(in Status status, in RecaptchaResultData data) = 0;
    oneway void onResults(in Status status, in ExecuteResults results) = 1;
}
