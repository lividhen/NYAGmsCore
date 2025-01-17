/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.signin.internal;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class CheckServerAuthResult extends AutoSafeParcelable {
    public static final Parcelable.Creator<CheckServerAuthResult> CREATOR = new AutoCreator<>(CheckServerAuthResult.class);
}
