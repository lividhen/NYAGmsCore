/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.googlehelp;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class FRDProductSpecificDataEntry extends AutoSafeParcelable {
    public static final Parcelable.Creator<FRDProductSpecificDataEntry> CREATOR = findCreator(FRDProductSpecificDataEntry.class);
}
