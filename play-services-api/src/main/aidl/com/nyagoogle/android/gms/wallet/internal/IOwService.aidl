package com.nyagoogle.android.gms.wallet.internal;

import com.nyagoogle.android.gms.wallet.internal.IWalletServiceCallbacks;
import com.nyagoogle.android.gms.wallet.IsReadyToPayRequest;

interface IOwService {
    void isReadyToPay(in IsReadyToPayRequest request, in Bundle args, IWalletServiceCallbacks callbacks) = 13;
}
