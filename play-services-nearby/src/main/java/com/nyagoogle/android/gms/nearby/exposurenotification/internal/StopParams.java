/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.nearby.exposurenotification.internal;

import com.nyagoogle.android.gms.common.api.internal.IStatusCallback;

import org.microg.safeparcel.AutoSafeParcelable;

public class StopParams extends AutoSafeParcelable {
    @Field(1)
    public IStatusCallback callback;

    private StopParams() {
    }

    public StopParams(IStatusCallback callback) {
        this.callback = callback;
    }

    public static final Creator<StopParams> CREATOR = new AutoCreator<>(StopParams.class);
}
