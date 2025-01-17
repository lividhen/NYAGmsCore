package com.nyagoogle.android.gms.appinvite.internal;


import com.nyagoogle.android.gms.common.api.Status;
import android.content.Intent;


interface IAppInviteCallbacks {
    void onStatus(in Status status) = 0;
    void onStatusIntent(in Status status, in Intent intent) = 1;
}
