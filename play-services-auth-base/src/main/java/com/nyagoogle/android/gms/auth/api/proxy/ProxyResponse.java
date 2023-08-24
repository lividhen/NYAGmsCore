/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ProxyResponse extends AutoSafeParcelable {
    public static final int STATUS_CODE_NO_CONNECTION = -1;

    @SafeParcelable.Field(1000)
    private int versionCode = 1;
    @SafeParcelable.Field(1)
    public int gmsStatusCode;
    @SafeParcelable.Field(2)
    public PendingIntent recoveryAction;
    @SafeParcelable.Field(3)
    public int httpStatusCode;
    @SafeParcelable.Field(4)
    public Bundle headers;
    @SafeParcelable.Field(5)
    public byte[] body;

    public static final Parcelable.Creator<ProxyResponse> CREATOR = new AutoCreator<>(ProxyResponse.class);
}
