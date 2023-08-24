/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.measurement.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

import java.util.List;

public class AppMetadata extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String packageName;
    @SafeParcelable.Field(3)
    public String googleAppId;
    @SafeParcelable.Field(4)
    public String versionName;
    @SafeParcelable.Field(5)
    public String installerPackageName;
    @SafeParcelable.Field(6)
    private long googleVersion;
    @SafeParcelable.Field(7)
    private long devCertHash;
    @SafeParcelable.Field(8)
    private String healthMonitor;
    @SafeParcelable.Field(9)
    private boolean measurementEnabled = true;
    @SafeParcelable.Field(10)
    private boolean firstOpen;
    @SafeParcelable.Field(11)
    public long versionCode = Integer.MIN_VALUE;
    @SafeParcelable.Field(12)
    private String firebaseInstanceId;
    @SafeParcelable.Field(13)
    private long androidId;
    @SafeParcelable.Field(14)
    private long instantiationTime;
    @SafeParcelable.Field(15)
    public int appType;
    @SafeParcelable.Field(16)
    private boolean adIdReportingEnabled;
    @SafeParcelable.Field(17)
    public boolean ssaidCollectionEnabled = true;
    @SafeParcelable.Field(18)
    public boolean deferredAnalyticsCollection;
    @SafeParcelable.Field(19)
    public String admobAppId;
    @SafeParcelable.Field(21)
    public Boolean allowAdPersonalization;
    @SafeParcelable.Field(22)
    private long dynamiteVersion;
    @SafeParcelable.Field(23)
    public List<String> safelistedEvents;
    @SafeParcelable.Field(24)
    public String gaAppId;
    @SafeParcelable.Field(25)
    private String consentSettings;
    @SafeParcelable.Field(26)
    private String ephemeralAppInstanceId;
    @SafeParcelable.Field(27)
    private String sessionStitchingToken;
    @SafeParcelable.Field(28)
    private boolean sgtmUploadEnabled;
    @SafeParcelable.Field(29)
    private long targetOsVersion;
    @SafeParcelable.Field(30)
    private int consentSource;
    @SafeParcelable.Field(31)
    private String dmaConsent;
    @SafeParcelable.Field(32)
    private int adServicesVersion;

    public String toString() {
        return "AppMetadata[" + packageName + "]";
    }

    public static final Parcelable.Creator<AppMetadata> CREATOR = new AutoCreator<>(AppMetadata.class);
}
