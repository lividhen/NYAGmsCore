/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.signin.internal;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import com.nyagoogle.android.gms.common.internal.ResolveAccountRequest;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.common.Hide;
import org.microg.gms.utils.ToStringHelper;
import org.microg.safeparcel.AutoSafeParcelable;

@Hide
public class SignInRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private final int versionCode = 1;
    @SafeParcelable.Field(2)
    public ResolveAccountRequest request;

    @NonNull
    @Override
    public String toString() {
        return ToStringHelper.name("SignInRequest")
                .field("request", request)
                .end();
    }

    public static final Parcelable.Creator<SignInRequest> CREATOR = new AutoCreator<>(SignInRequest.class);
}
