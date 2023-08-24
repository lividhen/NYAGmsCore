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

public class CreateAuthUriResponse extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String authUri;
    @SafeParcelable.Field(3)
    public boolean isRegistered;
    @SafeParcelable.Field(4)
    public String providerId;
    @SafeParcelable.Field(5)
    public boolean isForExistingProvider;
    @SafeParcelable.Field(6)
    public StringList stringList = new StringList();
    @SafeParcelable.Field(7)
    public List<String> signInMethods = new ArrayList<>();
    public static final Parcelable.Creator<CreateAuthUriResponse> CREATOR = new AutoCreator<>(CreateAuthUriResponse.class);
}
