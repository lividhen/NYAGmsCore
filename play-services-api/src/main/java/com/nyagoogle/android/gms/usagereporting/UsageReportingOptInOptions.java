/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.usagereporting;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class UsageReportingOptInOptions extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public int optInUsageReporting;

    public static final Parcelable.Creator<UsageReportingOptInOptions> CREATOR = new AutoCreator<>(UsageReportingOptInOptions.class);
}
