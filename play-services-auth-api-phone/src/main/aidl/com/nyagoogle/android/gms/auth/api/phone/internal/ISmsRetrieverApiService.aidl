package com.nyagoogle.android.gms.auth.api.phone.internal;

import com.nyagoogle.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback;
import com.nyagoogle.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback;
import com.nyagoogle.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback;
import com.nyagoogle.android.gms.common.api.internal.IStatusCallback;
import com.nyagoogle.android.gms.common.api.Status;

import java.lang.String;

interface ISmsRetrieverApiService {
    void startSmsRetriever(ISmsRetrieverResultCallback callback) = 0;
    void startWithConsentPrompt(String senderPhoneNumber, ISmsRetrieverResultCallback callback) = 1;
    void startSmsCodeAutofill(IStatusCallback callback) = 2;
    void checkAutofillPermissionState(IAutofillPermissionStateCallback callback) = 3;
    void checkOngoingSmsRequest(String packageName, IOngoingSmsRequestCallback callback) = 4;
    void startSmsCodeBrowser(IStatusCallback callback) = 5;
}