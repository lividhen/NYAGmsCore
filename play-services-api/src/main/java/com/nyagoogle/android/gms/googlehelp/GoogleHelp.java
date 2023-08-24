/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import com.nyagoogle.android.gms.feedback.ErrorReport;
import com.nyagoogle.android.gms.feedback.ThemeSettings;
import com.nyagoogle.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.nyagoogle.android.gms.googlehelp.internal.common.TogglingData;
import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.utils.ToStringHelper;
import org.microg.safeparcel.AutoSafeParcelable;

import java.util.List;

public class GoogleHelp extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    private int versionCode;
    @SafeParcelable.Field(2)
    public String appContext;
    @SafeParcelable.Field(3)
    public Account account;
    @SafeParcelable.Field(4)
    public Bundle extras;
    @SafeParcelable.Field(5)
    public boolean unknownBool5;
    @SafeParcelable.Field(6)
    public boolean unknownBool6;
    @SafeParcelable.Field(7)
    public List<String> unknownStringList7;
    @SafeParcelable.Field(15)
    public Uri uri;
    @SafeParcelable.Field(16)
    public List<OverflowMenuItem> overflowMenuItems;
    @SafeParcelable.Field(17)
    public int unknownAlwaysZero17;
    @SafeParcelable.Field(18)
    public List<OfflineSuggestion> offlineSuggestions;
    @SafeParcelable.Field(20)
    public int unknownInt20;
    @SafeParcelable.Field(21)
    public int unknownInt21;
    @SafeParcelable.Field(22)
    public boolean unknownBool22;
    @SafeParcelable.Field(23)
    public ErrorReport errorReport;
    @SafeParcelable.Field(25)
    public ThemeSettings themeSettings;
    @SafeParcelable.Field(28)
    public String appPackageName;
    @SafeParcelable.Field(31)
    public TogglingData togglingData;
    @SafeParcelable.Field(32)
    public int unknownInt32;
    @SafeParcelable.Field(33)
    public PendingIntent customFeedbackPendingIntent;
    @SafeParcelable.Field(34)
    public String title;
    @SafeParcelable.Field(35)
    public Bitmap icon;
    @SafeParcelable.Field(36)
    public int unknownInt36;
    @SafeParcelable.Field(37)
    public boolean unknownBool37;
    @SafeParcelable.Field(38)
    public boolean unknownBool38;
    @SafeParcelable.Field(39)
    public int timeout;
    @SafeParcelable.Field(40)
    public String sessionId;
    @SafeParcelable.Field(41)
    public boolean unknownBool41;
    @SafeParcelable.Field(42)
    public String clientPackageName;
    @SafeParcelable.Field(43)
    public boolean unknownBool43;
    @SafeParcelable.Field(44)
    public ND4CSettings nd4CSettings;
    @SafeParcelable.Field(45)
    public boolean unknownBool45;
    @SafeParcelable.Field(46)
    public List<FRDProductSpecificDataEntry> productSpecificDataEntries;

    @NonNull
    @Override
    public String toString() {
        return ToStringHelper.name("GoogleHelp")
                .field("appContext", appContext)
                .field("account", account)
                .field("extras", extras)
                .field("5", unknownBool5)
                .field("6", unknownBool6)
                .field("7", unknownStringList7)
                .field("uri", uri)
                .field("overflowMenuItems", overflowMenuItems)
                .field("17", unknownAlwaysZero17)
                .field("offlineSuggestions", offlineSuggestions)
                .field("20", unknownInt20)
                .field("21", unknownInt21)
                .field("22", unknownBool22)
                .field("errorReport", errorReport)
                .field("themeSettings", themeSettings)
                .field("appPackageName", appPackageName)
                .field("togglingData", togglingData)
                .field("32", unknownInt32)
                .field("customFeedbackPendingIntent", customFeedbackPendingIntent)
                .field("title", title)
                .field("icon", icon)
                .field("36", unknownInt36)
                .field("37", unknownBool37)
                .field("38", unknownBool38)
                .field("timeout", timeout)
                .field("sessionId", sessionId)
                .field("41", unknownBool41)
                .field("clientPackageName", clientPackageName)
                .field("43", unknownBool43)
                .field("nd4CSettings", nd4CSettings)
                .field("45", unknownBool45)
                .field("productSpecificDataEntries", productSpecificDataEntries)
                .end();
    }

    public static final Parcelable.Creator<GoogleHelp> CREATOR = findCreator(GoogleHelp.class);
}
