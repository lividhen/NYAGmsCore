/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.credential.manager.invocationparams;

import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class CredentialManagerAccount extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String name;

    @NonNull
    @Override
    public String toString() {
        return name;
    }

    public static final String NAME_LOCAL = "pwm.constant.LocalAccount";
    public static final Parcelable.Creator<CredentialManagerAccount> CREATOR = new AutoCreator<>(CredentialManagerAccount.class);
}
