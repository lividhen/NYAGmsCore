/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ProxyRequest extends AutoSafeParcelable {
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;

    @SafeParcelable.Field(1000)
    private int versionCode = 2;
    @SafeParcelable.Field(1)
    public String url;
    @SafeParcelable.Field(2)
    public int httpMethod;
    @SafeParcelable.Field(3)
    public long timeoutMillis;
    @SafeParcelable.Field(4)
    public byte[] body;
    @SafeParcelable.Field(5)
    public Bundle headers;

    @Override
    public String toString() {
        return url;
    }

    public static final Parcelable.Creator<ProxyRequest> CREATOR = new AutoCreator<>(ProxyRequest.class);
}
