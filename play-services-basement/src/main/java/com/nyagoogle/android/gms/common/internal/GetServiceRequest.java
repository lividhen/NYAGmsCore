/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nyagoogle.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.Feature;
import com.nyagoogle.android.gms.common.api.Scope;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.common.Constants;
import org.microg.gms.common.GmsService;
import org.microg.safeparcel.AutoSafeParcelable;

import java.util.Arrays;

public class GetServiceRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private int versionCode = 6;
    @SafeParcelable.Field(2)
    public final int serviceId;
    @SafeParcelable.Field(3)
    public int gmsVersion;
    @SafeParcelable.Field(4)
    public String packageName;
    @SafeParcelable.Field(5)
    public IBinder accountAccessor;
    @SafeParcelable.Field(6)
    public Scope[] scopes;
    @SafeParcelable.Field(7)
    public Bundle extras;
    @SafeParcelable.Field(8)
    public Account account;
    @SafeParcelable.Field(9)
    @Deprecated
    private long field9;
    @SafeParcelable.Field(10)
    public Feature[] defaultFeatures;
    @SafeParcelable.Field(11)
    public Feature[] apiFeatures;
    @SafeParcelable.Field(12)
    private boolean field12;
    @SafeParcelable.Field(13)
    private int field13;
    @SafeParcelable.Field(14)
    private boolean field14;
    @SafeParcelable.Field(15)
    private String attributionTag;

    private GetServiceRequest() {
        serviceId = -1;
        gmsVersion = Constants.GMS_VERSION_CODE;
    }

    public GetServiceRequest(int serviceId) {
        this.serviceId = serviceId;
        this.gmsVersion = Constants.GMS_VERSION_CODE;
        this.field12 = true;
    }

    @Override
    public String toString() {
        return "GetServiceRequest{" +
                "serviceId=" + GmsService.nameFromServiceId(serviceId) +
                ", gmsVersion=" + gmsVersion +
                ", packageName='" + packageName + '\'' +
                (scopes == null || scopes.length == 0 ? "" : (", scopes=" + Arrays.toString(scopes))) +
                (extras == null ? "" : (", extras=" + extras)) +
                (account == null ? "" : (", account=" + account)) +
                '}';
    }

    public static Parcelable.Creator<GetServiceRequest> CREATOR = new AutoCreator<GetServiceRequest>(GetServiceRequest.class);
}