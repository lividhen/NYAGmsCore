/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.location;

import android.os.SystemClock;

import org.microg.gms.common.Hide;
import org.microg.safeparcel.AutoSafeParcelable;

@Hide
public class DeviceOrientationRequest extends AutoSafeParcelable {
    @Field(1)
    public boolean shouldUseMag = true;
    @Field(2)
    public long minimumSamplingPeriodUs = 50000;
    @Field(3)
    public float smallestAngleChangeRadians = 0.0f;
    @Field(4)
    public long expirationTime = Long.MAX_VALUE;
    @Field(5)
    public int numUpdates = Integer.MAX_VALUE;
    @Field(6)
    public boolean enableVelocity = false;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[shouldUseMag=").append(shouldUseMag);
        sb.append(" minimumSamplingPeriod=").append(minimumSamplingPeriodUs).append("us");
        sb.append(" smallesAngleChange=").append(smallestAngleChangeRadians).append("rad");
        if (expirationTime != Long.MAX_VALUE)
            sb.append(" expireIn=").append(expirationTime - SystemClock.elapsedRealtime()).append("ms");
        if (numUpdates != Integer.MAX_VALUE)
            sb.append(" num=").append(numUpdates);
        if (enableVelocity)
            sb.append(" withVelocity");
        sb.append("]");
        return sb.toString();
    }

    public static final Creator<DeviceOrientationRequest> CREATOR = new AutoCreator<DeviceOrientationRequest>(DeviceOrientationRequest.class);
}
