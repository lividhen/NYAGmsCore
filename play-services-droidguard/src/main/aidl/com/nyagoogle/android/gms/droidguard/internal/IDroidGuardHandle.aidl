package com.nyagoogle.android.gms.droidguard.internal;

import com.nyagoogle.android.gms.droidguard.internal.DroidGuardInitReply;
import com.nyagoogle.android.gms.droidguard.internal.DroidGuardResultsRequest;

interface IDroidGuardHandle {
    oneway void init(String flow) = 0;
    byte[] snapshot(in Map map) = 1;
    oneway void close() = 2;
    DroidGuardInitReply initWithRequest(String flow, in DroidGuardResultsRequest request) = 4;
}
