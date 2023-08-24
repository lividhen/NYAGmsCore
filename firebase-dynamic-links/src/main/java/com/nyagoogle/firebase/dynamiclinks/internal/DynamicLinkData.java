/*
 * SPDX-FileCopyrightText: 2019, e Foundation
 * SPDX-FileCopyrightText: 2021, Google LLC
 * SPDX-FileCopyrightText: 2021, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.dynamiclinks.internal;

import org.microg.safeparcel.AutoSafeParcelable;

import android.os.Bundle;
import android.net.Uri;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

public class DynamicLinkData extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public final String dynamicLink;

    @SafeParcelable.Field(2)
    public final String deepLink;

    @SafeParcelable.Field(3)
    public final int minVersion;

    @SafeParcelable.Field(4)
    public final long clickTimestamp;

    @SafeParcelable.Field(5)
    public final Bundle extensionBundle;

    @SafeParcelable.Field(6)
    public final Uri redirectUrl;

    public DynamicLinkData() {
        dynamicLink = "";
        deepLink = "";
        minVersion = 0;
        clickTimestamp = 0;
        extensionBundle = new Bundle();
        redirectUrl = Uri.EMPTY;
    }

    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new AutoCreator<DynamicLinkData>(DynamicLinkData.class);
}
