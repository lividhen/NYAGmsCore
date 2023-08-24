/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class NonagonRequestParcel extends AutoSafeParcelable {
    public static final Parcelable.Creator<NonagonRequestParcel> CREATOR = new AutoCreator<>(NonagonRequestParcel.class);
}
