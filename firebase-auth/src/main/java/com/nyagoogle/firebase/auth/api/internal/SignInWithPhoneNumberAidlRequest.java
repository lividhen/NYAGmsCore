/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.firebase.auth.PhoneAuthCredential;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class SignInWithPhoneNumberAidlRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public PhoneAuthCredential credential;
    @SafeParcelable.Field(2)
    public String tenantId;

    public static final Parcelable.Creator<SignInWithPhoneNumberAidlRequest> CREATOR = new AutoCreator<>(SignInWithPhoneNumberAidlRequest.class);
}
