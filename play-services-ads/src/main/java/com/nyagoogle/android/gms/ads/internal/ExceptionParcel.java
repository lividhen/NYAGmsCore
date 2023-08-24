/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ExceptionParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String message;
    @SafeParcelable.Field(2)
    public int code;
    public static final Parcelable.Creator<ExceptionParcel> CREATOR = new AutoCreator<>(ExceptionParcel.class);
}
