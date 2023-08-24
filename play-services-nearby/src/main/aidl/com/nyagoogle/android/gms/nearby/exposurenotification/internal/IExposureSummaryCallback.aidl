/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.nearby.exposurenotification.internal;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.nearby.exposurenotification.ExposureSummary;

interface IExposureSummaryCallback {
    void onResult(in Status status, in ExposureSummary result);
}