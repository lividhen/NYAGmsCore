/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.credential.manager.firstparty.internal;

import com.nyagoogle.android.gms.common.api.internal.IStatusCallback;
import com.nyagoogle.android.gms.credential.manager.common.IPendingIntentCallback;
import com.nyagoogle.android.gms.credential.manager.common.ISettingsCallback;
import com.nyagoogle.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

interface ICredentialManagerService {
    void getCredentialManagerIntent(IPendingIntentCallback callback, in CredentialManagerInvocationParams params) = 0;
    void getSetting(ISettingsCallback callback, String key) = 1;
    void setSetting(IStatusCallback callback, String key, in byte[] value) = 2;
}