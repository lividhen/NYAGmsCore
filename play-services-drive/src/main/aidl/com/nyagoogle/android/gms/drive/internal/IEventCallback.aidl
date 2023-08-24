package com.nyagoogle.android.gms.drive.internal;

import com.nyagoogle.android.gms.drive.internal.EventResponse;

interface IEventCallback {
    void onEventResponse(in EventResponse response) = 0;
}
