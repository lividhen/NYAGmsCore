package com.nyagoogle.android.gms.clearcut.internal;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.common.data.DataHolder;

interface IClearcutLoggerCallbacks {
    oneway void onLogResult(in Status status) = 0;
    oneway void onForceUploadResult(in Status status) = 1;
    oneway void onStartCollectForDebugResult(in Status status, long l) = 2;
    oneway void onStopCollectForDebugResult(in Status status) = 3;
    oneway void onCollectForDebugExpiryTime(in Status status, long l) = 4;
    oneway void onLogEventParcelables(in DataHolder data) = 6;
}
