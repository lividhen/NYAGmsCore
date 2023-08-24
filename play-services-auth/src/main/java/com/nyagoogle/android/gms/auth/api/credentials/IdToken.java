/*
 * SPDX-FileCopyrightText: 2016, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 * Notice: Portions of this file are reproduced from work created and shared by Google and used
 *         according to terms described in the Creative Commons 4.0 Attribution License.
 *         See https://developers.google.com/readme/policies for details.
 */

package com.nyagoogle.android.gms.auth.api.credentials;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.common.PublicApi;
import org.microg.safeparcel.AutoSafeParcelable;

@PublicApi
public class IdToken extends AutoSafeParcelable {

    @SafeParcelable.Field(1000)
    private int versionCode = 1;

    @SafeParcelable.Field(1)
    private String accountType;

    @SafeParcelable.Field(2)
    private String id;

    private IdToken() {
    }

    public IdToken(String accountType, String id) {
        this.accountType = accountType;
        this.id = id;
    }

    /**
     * Returns {@code AccountManager} account type for the token.
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Returns the ID token, formatted according to the rules defined by the account type.
     */
    public String getIdToken() {
        return id;
    }

    public static final Parcelable.Creator<IdToken> CREATOR = new AutoCreator<IdToken>(IdToken.class);
}
