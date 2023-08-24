/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.auth;

import android.accounts.Account;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class HasCababilitiesRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public Account account;
    @SafeParcelable.Field(2)
    public String[] capabilities;
    public static final Parcelable.Creator<HasCababilitiesRequest> CREATOR = new AutoCreator<>(HasCababilitiesRequest.class);
}
