/*
 * SPDX-FileCopyrightText: 2021, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.dynamiclinks.internal;

import android.os.Parcelable;

import com.nyagoogle.firebase.dynamiclinks.ShortDynamicLink;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class WarningImpl extends AutoSafeParcelable implements ShortDynamicLink.Warning {
    @SafeParcelable.Field(1)
    @Deprecated
    private int code = 1;

    @SafeParcelable.Field(2)
    private final String message;

    private WarningImpl() {
        this.message = null;
    }

    public WarningImpl(String message) {
        this.message = message;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static final Parcelable.Creator<WarningImpl> CREATOR = new AutoCreator<WarningImpl>(WarningImpl.class);
}
