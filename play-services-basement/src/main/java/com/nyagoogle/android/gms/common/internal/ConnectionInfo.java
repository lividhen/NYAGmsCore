/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.Feature;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ConnectionInfo extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public Bundle params;
    @SafeParcelable.Field(2)
    public Feature[] features;
    @SafeParcelable.Field(3)
    public int unknown3;

    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new AutoSafeParcelable.AutoCreator<>(ConnectionInfo.class);
}
