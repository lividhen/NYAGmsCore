/*
 * SPDX-FileCopyrightText: 2019, e Foundation
 * SPDX-FileCopyrightText: 2021, Google LLC
 * SPDX-FileCopyrightText: 2021, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

import java.util.ArrayList;
import java.util.List;


public class ShortDynamicLinkImpl extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public final Uri shortLink;

    @SafeParcelable.Field(2)
    public final Uri previewLink;

    @SafeParcelable.Field(3)
    public final List<WarningImpl> warnings;


    public ShortDynamicLinkImpl() {
        shortLink = Uri.EMPTY;
        previewLink = Uri.EMPTY;

        warnings = new ArrayList<>();
    }


    public static final Parcelable.Creator<ShortDynamicLinkImpl> CREATOR = new AutoCreator<ShortDynamicLinkImpl>(ShortDynamicLinkImpl.class);
}
