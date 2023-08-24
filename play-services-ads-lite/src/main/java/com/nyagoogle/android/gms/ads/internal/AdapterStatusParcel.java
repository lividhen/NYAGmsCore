/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class AdapterStatusParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String className;
    @SafeParcelable.Field(2)
    public boolean isReady;
    @SafeParcelable.Field(3)
    public int latency;
    @SafeParcelable.Field(4)
    public String description;

    public AdapterStatusParcel() {}

    public AdapterStatusParcel(String className, boolean isReady, int latency, String description) {
        this.className = className;
        this.isReady = isReady;
        this.latency = latency;
        this.description = description;
    }

    public static final Parcelable.Creator<AdapterStatusParcel> CREATOR = new AutoCreator<>(AdapterStatusParcel.class);
}
