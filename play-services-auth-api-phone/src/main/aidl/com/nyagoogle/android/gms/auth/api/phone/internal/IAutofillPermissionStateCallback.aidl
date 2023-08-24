package com.nyagoogle.android.gms.auth.api.phone.internal;

import com.nyagoogle.android.gms.common.api.Status;

interface IAutofillPermissionStateCallback {
    void onCheckPermissionStateResult(in Status status, int result) = 0;
}
