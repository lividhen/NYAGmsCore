package com.nyagoogle.android.gms.common.internal;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface ISignInButtonCreator {
    IObjectWrapper createSignInButton(IObjectWrapper context, int size, int color); // returns View
}
