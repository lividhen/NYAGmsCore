package com.nyagoogle.android.gms.fido.fido2.internal.privileged;

import android.app.PendingIntent;
import com.nyagoogle.android.gms.common.api.Status;

interface IFido2PrivilegedCallbacks {
    void onPendingIntent(in Status status, in PendingIntent pendingIntent);
}
