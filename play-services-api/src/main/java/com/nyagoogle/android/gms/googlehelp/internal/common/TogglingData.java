/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.googlehelp.internal.common;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class TogglingData extends AutoSafeParcelable {
    public static final Parcelable.Creator<TogglingData> CREATOR = findCreator(TogglingData.class);
}