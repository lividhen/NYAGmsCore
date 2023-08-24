/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.ads.internal.client.IResponseInfo;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class AdErrorParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public int code;
    @SafeParcelable.Field(2)
    public String message;
    @SafeParcelable.Field(3)
    public String domain;
    @SafeParcelable.Field(4)
    public AdErrorParcel cause;
    @SafeParcelable.Field(5)
    public IResponseInfo responseInfo;
    public static final Parcelable.Creator<AdErrorParcel> CREATOR = new AutoCreator<>(AdErrorParcel.class);
}
