/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class SearchAdRequestParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(15)
    public String query;
    public static final Parcelable.Creator<SearchAdRequestParcel> CREATOR = new AutoCreator<>(SearchAdRequestParcel.class);
}
