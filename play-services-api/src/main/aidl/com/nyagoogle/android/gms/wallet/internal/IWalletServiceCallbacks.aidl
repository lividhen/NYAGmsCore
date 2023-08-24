package com.nyagoogle.android.gms.wallet.internal;

import com.nyagoogle.android.gms.common.api.Status;

interface IWalletServiceCallbacks {
    void onIsReadyToPayResponse(in Status status, boolean result, in Bundle args) = 8;
}
