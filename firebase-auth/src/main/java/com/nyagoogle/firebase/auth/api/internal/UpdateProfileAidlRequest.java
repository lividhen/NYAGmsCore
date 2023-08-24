/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.firebase.auth.UserProfileChangeRequest;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class UpdateProfileAidlRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public UserProfileChangeRequest request;
    @SafeParcelable.Field(2)
    public String cachedState;
    public static final Parcelable.Creator<UpdateProfileAidlRequest> CREATOR = new AutoCreator<>(UpdateProfileAidlRequest.class);
}
