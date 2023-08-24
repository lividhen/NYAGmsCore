/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.firebase.auth.DefaultOAuthCredential;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

import java.util.List;

public class GetAccountInfoUser extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String localId;
    @SafeParcelable.Field(3)
    public String email;
    @SafeParcelable.Field(4)
    public boolean isEmailVerified;
    @SafeParcelable.Field(5)
    public String displayName;
    @SafeParcelable.Field(6)
    public String photoUrl;
    @SafeParcelable.Field(7)
    public ProviderUserInfoList providerInfoList = new ProviderUserInfoList();
    @SafeParcelable.Field(8)
    public String password;
    @SafeParcelable.Field(9)
    public String phoneNumber;
    @SafeParcelable.Field(10)
    public long creationTimestamp;
    @SafeParcelable.Field(11)
    public long lastSignInTimestamp;
    @SafeParcelable.Field(12)
    public boolean isNewUser;
    @SafeParcelable.Field(13)
    public DefaultOAuthCredential defaultOAuthCredential;
    @SafeParcelable.Field(14)
    public List<MfaInfo> mfaInfoList;

    public static final Parcelable.Creator<GetAccountInfoUser> CREATOR = new AutoCreator<>(GetAccountInfoUser.class);
}
