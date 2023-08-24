/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.signin.internal;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import com.nyagoogle.android.gms.common.ConnectionResult;
import com.nyagoogle.android.gms.common.internal.ResolveAccountResponse;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.common.Hide;
import org.microg.gms.utils.ToStringHelper;
import org.microg.safeparcel.AutoSafeParcelable;

@Hide
public class SignInResponse extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private final int versionCode = 1;
    @SafeParcelable.Field(2)
    public ConnectionResult connectionResult;
    @SafeParcelable.Field(3)
    public ResolveAccountResponse response;

    @NonNull
    @Override
    public String toString() {
        return ToStringHelper.name("SignInResponse")
                .field("connectionResult", connectionResult)
                .field("response", response)
                .end();
    }

    public static final Parcelable.Creator<SignInResponse> CREATOR = new AutoCreator<>(SignInResponse.class);
}
