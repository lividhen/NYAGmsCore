/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.credential.manager.invocationparams;

import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class CallerInfo extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String s1;
    @SafeParcelable.Field(2)
    public String s2;
    @SafeParcelable.Field(3)
    public String s3;
    @SafeParcelable.Field(4)
    public String s4;

    @NonNull
    @Override
    public String toString() {
        return "CallerInfo(" + s1 + "," + s2 + "," + s3 + "," + s4 + ")";
    }

    public static final Parcelable.Creator<CallerInfo> CREATOR = new AutoCreator<>(CallerInfo.class);
}
