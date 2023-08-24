/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

import java.util.ArrayList;
import java.util.List;

public class ProviderUserInfoList extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public List<ProviderUserInfo> providerUserInfos = new ArrayList<>();


    public static final Parcelable.Creator<ProviderUserInfoList> CREATOR = new AutoCreator<>(ProviderUserInfoList.class);
}
