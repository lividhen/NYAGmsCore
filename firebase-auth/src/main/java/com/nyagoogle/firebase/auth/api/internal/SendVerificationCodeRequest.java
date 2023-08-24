/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class SendVerificationCodeRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    public String phoneNumber;
    @SafeParcelable.Field(2)
    public Long timeoutInSeconds;
    @SafeParcelable.Field(3)
    public boolean forceNewSmsVerificationSession;
    @SafeParcelable.Field(4)
    public String languageHeader;
    @SafeParcelable.Field(5)
    public String tenantId;
    @SafeParcelable.Field(6)
    public String recaptchaToken;

    public static final Parcelable.Creator<SendVerificationCodeRequest> CREATOR = new AutoCreator<>(SendVerificationCodeRequest.class);
}
