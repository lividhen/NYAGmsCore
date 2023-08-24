/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.googlehelp;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class SupportRequestHelp extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public GoogleHelp googleHelp;
    @SafeParcelable.Field(4)
    public String phoneNumber;

    public static final Parcelable.Creator<SupportRequestHelp> CREATOR = findCreator(SupportRequestHelp.class);
}
