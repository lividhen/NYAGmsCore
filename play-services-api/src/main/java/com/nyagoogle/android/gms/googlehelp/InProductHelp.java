/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.googlehelp;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class InProductHelp extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public GoogleHelp googleHelp;
    public static final Parcelable.Creator<InProductHelp> CREATOR = findCreator(InProductHelp.class);
}
