/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

import java.util.ArrayList;
import java.util.List;

public class StringList extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public int versionCode = 1;
    @SafeParcelable.Field(2)
    public List<String> values = new ArrayList<>();
    public static final Parcelable.Creator<StringList> CREATOR = new AutoCreator<>(StringList.class);
}
