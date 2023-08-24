/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class SignInWithEmailAndPasswordAidlRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String email;
    @SafeParcelable.Field(2)
    public String password;
    @SafeParcelable.Field(3)
    public String tenantId;
    public static final Parcelable.Creator<SignInWithEmailAndPasswordAidlRequest> CREATOR = new AutoCreator<>(SignInWithEmailAndPasswordAidlRequest.class);
}
