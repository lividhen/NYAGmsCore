/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.os.Bundle;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class AdapterResponseInfoParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String adapterClassName;
    @SafeParcelable.Field(2)
    public long latencyMillis;
    @SafeParcelable.Field(3)
    public AdErrorParcel error;
    @SafeParcelable.Field(4)
    public Bundle credentials;
    @SafeParcelable.Field(5)
    public String adSourceName;
    @SafeParcelable.Field(6)
    public String adSourceId;
    @SafeParcelable.Field(7)
    public String adSourceInstanceName;
    @SafeParcelable.Field(8)
    public String adSourceInstanceId;

    public static final Parcelable.Creator<AdapterResponseInfoParcel> CREATOR = new AutoCreator<>(AdapterResponseInfoParcel.class);
}
