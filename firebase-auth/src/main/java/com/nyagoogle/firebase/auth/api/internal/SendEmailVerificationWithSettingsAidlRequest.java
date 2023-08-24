/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.firebase.auth.ActionCodeSettings;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class SendEmailVerificationWithSettingsAidlRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String token;
    @SafeParcelable.Field(2)
    public ActionCodeSettings settings;
    public static final Parcelable.Creator<SendEmailVerificationWithSettingsAidlRequest> CREATOR = new AutoCreator<>(SendEmailVerificationWithSettingsAidlRequest.class);
}
