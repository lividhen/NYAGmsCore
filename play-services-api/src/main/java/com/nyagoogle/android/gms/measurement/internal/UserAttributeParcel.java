/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.measurement.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class UserAttributeParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public int field1;
    @SafeParcelable.Field(2)
    public String name;
    @SafeParcelable.Field(3)
    public long timestamp;
    @SafeParcelable.Field(4)
    public Long field4;
    @SafeParcelable.Field(6)
    public String field6;
    @SafeParcelable.Field(7)
    public String field7;
    @SafeParcelable.Field(8)
    public Double field8;

    public static final Parcelable.Creator<UserAttributeParcel> CREATOR = new AutoCreator<>(UserAttributeParcel.class);
}
