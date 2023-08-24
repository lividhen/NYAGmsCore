/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class AdDataParcel extends AutoSafeParcelable {
    public static final Parcelable.Creator<AdDataParcel> CREATOR = new AutoCreator<>(AdDataParcel.class);
}
