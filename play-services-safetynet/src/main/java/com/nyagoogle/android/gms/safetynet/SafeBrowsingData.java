/*
 * SPDX-FileCopyrightText: 2017 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.safetynet;

import android.os.ParcelFileDescriptor;

import com.nyagoogle.android.gms.common.data.DataHolder;

import org.microg.safeparcel.AutoSafeParcelable;

public class SafeBrowsingData extends AutoSafeParcelable {
    @Field(1)
    public int versionCode = 1;
    @Field(2)
    public String metadata;
    @Field(3)
    public DataHolder data;
    @Field(4)
    public ParcelFileDescriptor fileDescriptor;
    public byte[] fileContents;
    @Field(5)
    public long lastUpdateTime;
    @Field(6)
    public byte[] state;

    public static final Creator<SafeBrowsingData> CREATOR = new AutoCreator<SafeBrowsingData>(SafeBrowsingData.class);
}
