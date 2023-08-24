/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import com.nyagoogle.android.gms.common.ConnectionResult;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.common.Hide;
import org.microg.gms.utils.ToStringHelper;
import org.microg.safeparcel.AutoSafeParcelable;

@Hide
public class ResolveAccountResponse extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private int versionCode = 2;
    @SafeParcelable.Field(2)
    public IBinder accountAccessor;
    @SafeParcelable.Field(3)
    public ConnectionResult connectionResult;
    @SafeParcelable.Field(4)
    public boolean saveDefaultAccount;
    @SafeParcelable.Field(5)
    public boolean fromCrossClientAuth;

    @NonNull
    @Override
    public String toString() {
        return ToStringHelper.name("ResolveAccountResponse")
                .field("connectionResult", connectionResult)
                .field("saveDefaultAccount", saveDefaultAccount)
                .field("fromCrossClientAuth", fromCrossClientAuth)
                .end();
    }

    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new AutoCreator<>(ResolveAccountResponse.class);
}
