package com.nyagoogle.android.gms.droidguard.internal;

import com.nyagoogle.android.gms.droidguard.internal.IDroidGuardCallbacks;
import com.nyagoogle.android.gms.droidguard.internal.IDroidGuardHandle;
import com.nyagoogle.android.gms.droidguard.internal.DroidGuardResultsRequest;

interface IDroidGuardService {
    void guard(IDroidGuardCallbacks callbacks, String flow, in Map map) = 0;
    void guardWithRequest(IDroidGuardCallbacks callbacks, String flow, in Map map, in DroidGuardResultsRequest request) = 3;

    IDroidGuardHandle getHandle() = 1;

    int getClientTimeoutMillis() = 2;
}
