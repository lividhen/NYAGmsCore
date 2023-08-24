/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class MfaInfo extends AutoSafeParcelable {


    public static final Parcelable.Creator<MfaInfo> CREATOR = new AutoCreator<>(MfaInfo.class);
}
