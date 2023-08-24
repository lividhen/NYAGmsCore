/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

import java.util.ArrayList;
import java.util.List;

public class AdRequestParcel extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private int versionCode = 8;
    @SafeParcelable.Field(2)
    public long birthday;
    @SafeParcelable.Field(3)
    public Bundle adMobNetworkExtras = new Bundle();
    @SafeParcelable.Field(4)
    public int gender;
    @SafeParcelable.Field(5)
    public ArrayList<String> keywords;
    @SafeParcelable.Field(6)
    public boolean isTestDevice;
    @SafeParcelable.Field(7)
    public int taggedForChildDirectedTreatment;
    @SafeParcelable.Field(9)
    public String publisherProvidedId;
    @SafeParcelable.Field(10)
    public SearchAdRequestParcel searchAdRequest;
    @SafeParcelable.Field(11)
    public Location location;
    @SafeParcelable.Field(12)
    public String contentUrl;
    @SafeParcelable.Field(13)
    public Bundle networkExtrasBundles = new Bundle();
    @SafeParcelable.Field(14)
    public Bundle customTargeting;
    @SafeParcelable.Field(15)
    public List<String> categoryExclusion;
    @SafeParcelable.Field(16)
    public String requestAgent;
    @SafeParcelable.Field(18)
    public boolean designedForFamilies;
    @SafeParcelable.Field(19)
    public AdDataParcel adData;
    @SafeParcelable.Field(20)
    public int tagForUnderAgeOfConsent;
    @SafeParcelable.Field(21)
    public String maxAdContentRating;
    @SafeParcelable.Field(22)
    public List<String> neighboringContentUrls;
    @SafeParcelable.Field(23)
    public int httpTimeoutMillis;
    @SafeParcelable.Field(24)
    public String adString;

    public static final Parcelable.Creator<AdRequestParcel> CREATOR = new AutoCreator<>(AdRequestParcel.class);
}
