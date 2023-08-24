package com.nyagoogle.android.gms.signin.internal;

import com.nyagoogle.android.gms.common.internal.AuthAccountRequest;
import com.nyagoogle.android.gms.common.internal.ResolveAccountRequest;
import com.nyagoogle.android.gms.common.internal.IAccountAccessor;
import com.nyagoogle.android.gms.common.internal.IResolveAccountCallbacks;
import com.nyagoogle.android.gms.signin.internal.ISignInCallbacks;
import com.nyagoogle.android.gms.signin.internal.CheckServerAuthResult;
import com.nyagoogle.android.gms.signin.internal.RecordConsentRequest;
import com.nyagoogle.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.nyagoogle.android.gms.signin.internal.SignInRequest;

interface ISignInService {
    void authAccount(in AuthAccountRequest request, ISignInCallbacks callbacks) = 1;
    void onCheckServerAuthorization(in CheckServerAuthResult result) = 2;
    void onUploadServerAuthCode(int sessionId) = 3;
    void resolveAccount(in ResolveAccountRequest request, IResolveAccountCallbacks callbacks) = 4;

    void clearAccountFromSessionStore(int sessionId) = 6;
    void putAccount(int sessionId, in Account account, ISignInCallbacks callbacks) = 7;
    void saveDefaultAccount(IAccountAccessor accountAccessor, int sessionId, boolean crossClient) = 8;
    void saveConsent(in RecordConsentRequest request, ISignInCallbacks callbacks) = 9;
    void getCurrentAccount(ISignInCallbacks callbacks) = 10;
    void signIn(in SignInRequest request, ISignInCallbacks callbacks) = 11;
    void setGamesHasBeenGreeted(boolean hasGreeted) = 12;
    void recordConsentByConsentResult(in RecordConsentByConsentResultRequest request, ISignInCallbacks callbacks) = 13;
}