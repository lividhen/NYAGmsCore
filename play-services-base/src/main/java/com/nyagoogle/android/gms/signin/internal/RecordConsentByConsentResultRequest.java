/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.signin.internal;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class RecordConsentByConsentResultRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator<RecordConsentByConsentResultRequest> CREATOR = new AutoCreator<>(RecordConsentByConsentResultRequest.class);
}
