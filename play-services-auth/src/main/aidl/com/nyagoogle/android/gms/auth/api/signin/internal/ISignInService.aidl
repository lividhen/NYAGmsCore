package com.nyagoogle.android.gms.auth.api.signin.internal;

import com.nyagoogle.android.gms.auth.api.signin.internal.ISignInCallbacks;
import com.nyagoogle.android.gms.auth.api.signin.GoogleSignInOptions;

interface ISignInService {
    void silentSignIn(ISignInCallbacks callbacks, in GoogleSignInOptions options) = 100;
    void signOut(ISignInCallbacks callbacks, in GoogleSignInOptions options) = 101;
    void revokeAccess(ISignInCallbacks callbacks, in GoogleSignInOptions options) = 102;
}