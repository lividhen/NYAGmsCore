package com.nyagoogle.android.gms.languageprofile.internal;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.languageprofile.LanguageFluency;
import com.nyagoogle.android.gms.languageprofile.LanguagePreference;

interface ILanguageProfileCallbacks {
    oneway void onString(in Status status, String s) = 0;
    oneway void onLanguagePreferences(in Status status, in List<LanguagePreference> preferences) = 1;
    oneway void onLanguageFluencies(in Status status, in List<LanguageFluency> fluencies) = 2;
}
