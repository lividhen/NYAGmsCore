/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.measurement.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ConditionalUserPropertyParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String appId;
    @SafeParcelable.Field(3)
    public String origin;
    @SafeParcelable.Field(4)
    public UserAttributeParcel userAttribute;
    @SafeParcelable.Field(5)
    public long creationTimestamp;
    @SafeParcelable.Field(6)
    public boolean active;
    @SafeParcelable.Field(7)
    public String triggerEventName;
    @SafeParcelable.Field(8)
    public EventParcel timedOutEvent;
    @SafeParcelable.Field(9)
    public long triggerTimeout;
    @SafeParcelable.Field(10)
    public EventParcel triggerEvent;
    @SafeParcelable.Field(11)
    public long timeToLive;
    @SafeParcelable.Field(12)
    public EventParcel expiredEvent;

    public static final Parcelable.Creator<ConditionalUserPropertyParcel> CREATOR = new AutoCreator<>(ConditionalUserPropertyParcel.class);
}
