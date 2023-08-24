/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.auth;

import android.content.Intent;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class GetHubTokenInternalResponse extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public TokenData tokenData;
    @SafeParcelable.Field(2)
    public String status;
    @SafeParcelable.Field(3)
    public Intent recoveryIntent;
    public static final Parcelable.Creator<GetHubTokenInternalResponse> CREATOR = new AutoCreator<>(GetHubTokenInternalResponse.class);
}
