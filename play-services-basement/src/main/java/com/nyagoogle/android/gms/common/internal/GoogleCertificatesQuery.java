/*
 * Copyright (C) 2019 microG Project Team
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

import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;
import com.nyagoogle.android.gms.dynamic.ObjectWrapper;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class GoogleCertificatesQuery extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private String packageName;
    @SafeParcelable.Field(2)
    private IBinder certDataBinder;
    private CertData certData;
    @SafeParcelable.Field(3)
    private boolean allowNonRelease;
    @SafeParcelable.Field(4)
    private boolean allowTestKeys;

    public String getPackageName() {
        return packageName;
    }

    public CertData getCertData() {
        if (certData == null && certDataBinder != null) {
            ICertData iCertData = null;
            if (certDataBinder instanceof CertData) {
                certData = (CertData) certDataBinder;
            } else if (certDataBinder instanceof IObjectWrapper) {
                certData = ObjectWrapper.unwrapTyped((IObjectWrapper) certDataBinder, CertData.class);
                if (certData == null) {
                    byte[] bytes = ObjectWrapper.unwrapTyped((IObjectWrapper) certDataBinder, byte[].class);
                    if (bytes != null) {
                        certData = new CertData(bytes);
                    }
                }
                if (certData == null) {
                    iCertData = ObjectWrapper.unwrapTyped((IObjectWrapper) certDataBinder, ICertData.class);
                }
            } else if (certDataBinder instanceof ICertData) {
                iCertData = (ICertData) certDataBinder;
            }
            if (iCertData != null) {
                try {
                    byte[] bytes = ObjectWrapper.unwrapTyped(iCertData.getWrappedBytes(), byte[].class);
                    if (bytes != null) {
                        certData = new CertData(bytes);
                    }
                } catch (RemoteException e) {
                    // Ignore
                }
            }
        }
        return certData;
    }

    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new AutoCreator<GoogleCertificatesQuery>(GoogleCertificatesQuery.class);
}
