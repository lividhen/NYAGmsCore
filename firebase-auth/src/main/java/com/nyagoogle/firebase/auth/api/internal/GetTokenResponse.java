/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.auth.api.internal;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.json.JSONException;
import org.json.JSONObject;
import org.microg.safeparcel.AutoSafeParcelable;

public class GetTokenResponse extends AutoSafeParcelable {
    @SafeParcelable.Field(2)
    public String refreshToken;
    @SafeParcelable.Field(3)
    public String accessToken;
    @SafeParcelable.Field(4)
    public Long expiresIn;
    @SafeParcelable.Field(5)
    public String tokenType;
    @SafeParcelable.Field(6)
    public Long issuedAt;

    public GetTokenResponse() {
        issuedAt = System.currentTimeMillis();
    }

    public static GetTokenResponse parseJson(String json) {
        try {
            JSONObject object = new JSONObject(json);
            GetTokenResponse response = new GetTokenResponse();
            response.refreshToken = object.optString("refresh_token", null);
            response.accessToken = object.optString("access_token", null);
            response.tokenType = object.optString("token_type", null);
            response.expiresIn = object.optLong("expires_in");
            response.issuedAt = object.optLong("issued_at");
            return response;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static final Parcelable.Creator<GetTokenResponse> CREATOR = new AutoCreator<>(GetTokenResponse.class);
}
