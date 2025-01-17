package com.nyagoogle.android.gms.recaptcha.internal;

import com.nyagoogle.android.gms.recaptcha.RecaptchaAction;
import com.nyagoogle.android.gms.recaptcha.RecaptchaHandle;

import com.nyagoogle.android.gms.recaptcha.internal.ExecuteParams;
import com.nyagoogle.android.gms.recaptcha.internal.InitParams;

import com.nyagoogle.android.gms.recaptcha.internal.ICloseCallback;
import com.nyagoogle.android.gms.recaptcha.internal.IExecuteCallback;
import com.nyagoogle.android.gms.recaptcha.internal.IInitCallback;

interface IRecaptchaService {
    void verifyWithRecaptcha(IExecuteCallback callback, String siteKey, String packageName) = 0;
    void init(IInitCallback callback, String siteKey) = 1;
    void execute(IExecuteCallback callback, in RecaptchaHandle handle, in RecaptchaAction action) = 2;
    void close(ICloseCallback callback, in RecaptchaHandle handle) = 3;
    void init2(IInitCallback callback, in InitParams params) = 4;
    void execute2(IExecuteCallback callback, in ExecuteParams params) = 5;
}
