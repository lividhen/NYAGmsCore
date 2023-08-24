/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class EventParams extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public Bundle data;

    public static final Parcelable.Creator<EventParams> CREATOR = new AutoCreator<>(EventParams.class);
}
