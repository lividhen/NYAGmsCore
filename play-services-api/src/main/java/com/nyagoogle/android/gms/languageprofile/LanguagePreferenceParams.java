/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.languageprofile;

import android.os.Parcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class LanguagePreferenceParams extends AutoSafeParcelable {
    public static final Parcelable.Creator<LanguagePreferenceParams> CREATOR = new AutoCreator<>(LanguagePreferenceParams.class);
}
