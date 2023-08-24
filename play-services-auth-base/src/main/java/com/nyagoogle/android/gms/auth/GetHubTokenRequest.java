/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.auth;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class GetHubTokenRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String accountName;
    @SafeParcelable.Field(2)
    public String service;
    @SafeParcelable.Field(3)
    public String packageName;
    @SafeParcelable.Field(4)
    public int callerUid;
    public static final Parcelable.Creator<GetHubTokenRequest> CREATOR = new AutoCreator<>(GetHubTokenRequest.class);
}
