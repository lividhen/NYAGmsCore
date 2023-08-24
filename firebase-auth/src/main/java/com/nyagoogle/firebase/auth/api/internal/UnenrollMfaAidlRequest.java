/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class UnenrollMfaAidlRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator<UnenrollMfaAidlRequest> CREATOR = new AutoCreator<>(UnenrollMfaAidlRequest.class);
}
