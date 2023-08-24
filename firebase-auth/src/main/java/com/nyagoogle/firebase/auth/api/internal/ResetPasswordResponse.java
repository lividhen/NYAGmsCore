/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ResetPasswordResponse extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String email;
    @SafeParcelable.Field(3)
    public String newEmail;
    @SafeParcelable.Field(4)
    public String requestType;
    @SafeParcelable.Field(5)
    public MfaInfo mfaInfo;
    public static final Parcelable.Creator<ResetPasswordResponse> CREATOR = new AutoCreator<>(ResetPasswordResponse.class);
}
