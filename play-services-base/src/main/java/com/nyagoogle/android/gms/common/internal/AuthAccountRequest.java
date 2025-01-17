/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.common.internal;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class AuthAccountRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new AutoCreator<>(AuthAccountRequest.class);
}
