/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms.safetynet;

import android.os.RemoteException;

import com.nyagoogle.android.gms.common.api.GoogleApiClient;
import com.nyagoogle.android.gms.common.api.PendingResult;
import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.safetynet.RecaptchaResultData;
import com.nyagoogle.android.gms.safetynet.SafetyNet;
import com.nyagoogle.android.gms.safetynet.SafetyNetApi;

import org.microg.gms.common.GmsConnector;

public class SafetyNetApiImpl implements SafetyNetApi {
    @Override
    public PendingResult<RecaptchaTokenResult> verifyWithRecaptcha(GoogleApiClient apiClient, String siteKey) {
        return GmsConnector.call(apiClient, SafetyNet.API, (GmsConnector.Callback<SafetyNetGmsClient, RecaptchaTokenResult>) (client, resultProvider) -> client.verifyWithRecaptcha(new ISafetyNetCallbacksDefaultStub() {
            @Override
            public void onRecaptchaResult(Status status, RecaptchaResultData recaptchaResultData) throws RemoteException {
                resultProvider.onResultAvailable(new RecaptchaTokenResult() {
                    @Override
                    public String getTokenResult() {
                        return recaptchaResultData.token;
                    }

                    @Override
                    public Status getStatus() {
                        return status;
                    }
                });
            }
        }, siteKey));
    }
}
