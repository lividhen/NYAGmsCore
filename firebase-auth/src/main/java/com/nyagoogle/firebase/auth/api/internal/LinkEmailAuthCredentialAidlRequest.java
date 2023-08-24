/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class LinkEmailAuthCredentialAidlRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String email;
    @SafeParcelable.Field(2)
    public String password;
    @SafeParcelable.Field(3)
    public String cachedState;
    public static final Parcelable.Creator<LinkEmailAuthCredentialAidlRequest> CREATOR = new AutoCreator<>(LinkEmailAuthCredentialAidlRequest.class);
}
