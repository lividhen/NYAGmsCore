package com.nyagoogle.android.gms.signin.internal;

import com.nyagoogle.android.gms.signin.internal.SignInResponse;

interface ISignInCallbacks {
    void onSignIn(in SignInResponse response) = 7;
}