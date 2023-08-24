/*
 * SPDX-FileCopyrightText: 2021, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.cast;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class RequestItem extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String url;
    @SafeParcelable.Field(3)
    public int protocolType;
    @SafeParcelable.Field(4)
    public int initialTime;
    @SafeParcelable.Field(5)
    public String hlsSegmentFormat;

    public static Parcelable.Creator<RequestItem> CREATOR = new AutoCreator<RequestItem>(RequestItem.class);
}
