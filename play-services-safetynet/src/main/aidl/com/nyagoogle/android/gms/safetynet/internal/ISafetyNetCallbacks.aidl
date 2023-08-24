package com.nyagoogle.android.gms.safetynet.internal;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.safetynet.AttestationData;
import com.nyagoogle.android.gms.safetynet.HarmfulAppsData;
import com.nyagoogle.android.gms.safetynet.HarmfulAppsInfo;
import com.nyagoogle.android.gms.safetynet.RecaptchaResultData;
import com.nyagoogle.android.gms.safetynet.RemoveHarmfulAppData;
import com.nyagoogle.android.gms.safetynet.SafeBrowsingData;

interface ISafetyNetCallbacks {
    oneway void onAttestationResult(in Status status, in AttestationData attestationData) = 0;
    oneway void onSharedUuid(String s) = 1;
    oneway void onSafeBrowsingData(in Status status, in SafeBrowsingData safeBrowsingData) = 2;
    oneway void onVerifyAppsUserResult(in Status status, boolean enabled) = 3;
    oneway void onHarmfulAppsData(in Status status, in List<HarmfulAppsData> harmfulAppsData) = 4;
    oneway void onRecaptchaResult(in Status status, in RecaptchaResultData recaptchaResultData) = 5;
    oneway void onHarmfulAppsInfo(in Status status, in HarmfulAppsInfo harmfulAppsInfo) = 7;
    oneway void onInitSafeBrowsingResult(in Status status) = 10;
    oneway void onRemoveHarmfulAppData(in Status status, in RemoveHarmfulAppData removeHarmfulAppData) = 14;
}
