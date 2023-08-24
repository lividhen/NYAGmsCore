/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ProviderUserInfo extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String federatedId;
    @SafeParcelable.Field(3)
    public String displayName;
    @SafeParcelable.Field(4)
    public String photoUrl;
    @SafeParcelable.Field(5)
    public String providerId;
    @SafeParcelable.Field(6)
    public String rawUserInfo;
    @SafeParcelable.Field(7)
    public String phoneNumber;
    @SafeParcelable.Field(8)
    public String email;

    public static final Parcelable.Creator<ProviderUserInfo> CREATOR = new AutoCreator<>(ProviderUserInfo.class);
}
