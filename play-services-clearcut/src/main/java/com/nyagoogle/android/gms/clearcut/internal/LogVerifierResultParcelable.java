/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.clearcut.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class LogVerifierResultParcelable  extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public boolean b;

    public static final Parcelable.Creator<LogVerifierResultParcelable> CREATOR = new AutoCreator<>(LogVerifierResultParcelable.class);
}
