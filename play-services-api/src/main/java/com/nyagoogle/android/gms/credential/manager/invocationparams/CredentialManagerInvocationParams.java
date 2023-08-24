/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.credential.manager.invocationparams;

import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.utils.ToStringHelper;
import org.microg.safeparcel.AutoSafeParcelable;

public class CredentialManagerInvocationParams extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public CredentialManagerAccount account;
    @SafeParcelable.Field(2)
    public CallerInfo caller;

    @NonNull
    @Override
    public String toString() {
        return ToStringHelper.name("CredentialManagerInvocationParams")
                .field("account", account)
                .field("caller", caller)
                .end();
    }

    public static final Parcelable.Creator<CredentialManagerInvocationParams> CREATOR = new AutoCreator<>(CredentialManagerInvocationParams.class);
}
