/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class SignInWithCustomTokenAidlRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String token;
    @SafeParcelable.Field(2)
    public String tenantId;

    public static final Parcelable.Creator<SignInWithCustomTokenAidlRequest> CREATOR = new AutoCreator<>(SignInWithCustomTokenAidlRequest.class);
}
