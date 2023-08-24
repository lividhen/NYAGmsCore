/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.measurement.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class EventParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String name;
    @SafeParcelable.Field(3)
    public EventParams params;
    @SafeParcelable.Field(4)
    public String origin;
    @SafeParcelable.Field(5)
    public long timestamp;

    public static final Parcelable.Creator<EventParcel> CREATOR = new AutoCreator<>(EventParcel.class);
}
