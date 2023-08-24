/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.nyagoogle.android.gms.auth.api.signin.GoogleSignInAccount;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.common.Hide;
import org.microg.gms.utils.ToStringHelper;
import org.microg.safeparcel.AutoSafeParcelable;

@Hide
public class ResolveAccountRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private int versionCode = 2;
    @SafeParcelable.Field(2)
    public Account account;
    @SafeParcelable.Field(3)
    public int sessionId;
    @SafeParcelable.Field(4)
    @Nullable
    public GoogleSignInAccount signInAccountHint;

    @NonNull
    @Override
    public String toString() {
        return ToStringHelper.name("ResolveAccountRequest")
                .field("account", account)
                .field("sessionId", sessionId)
                .field("signInAccountHint", signInAccountHint)
                .end();
    }

    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new AutoCreator<>(ResolveAccountRequest.class);
}
