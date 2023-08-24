/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.languageprofile;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class ClientLanguageSettings extends AutoSafeParcelable {
    public static final Parcelable.Creator<ClientLanguageSettings> CREATOR = new AutoCreator<>(ClientLanguageSettings.class);
}
