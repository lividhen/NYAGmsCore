/*
 * SPDX-FileCopyrightText: 2022 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 * Notice: Portions of this file are reproduced from work created and shared by Google and used
 *         according to terms described in the Creative Commons 4.0 Attribution License.
 *         See https://developers.google.com/readme/policies for details.
 */

package com.nyagoogle.android.gms.fido.fido2.api.common;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import org.microg.gms.common.PublicApi;
import org.microg.gms.utils.ToStringHelper;

import java.util.Arrays;

/**
 * The response after an error occurred.
 */
@PublicApi
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    @Field(2)
    private ErrorCode errorCode;
    @Field(3)
    private String errorMessage;

    private AuthenticatorErrorResponse() {
    }

    @PublicApi(exclude = true)
    public AuthenticatorErrorResponse(ErrorCode errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public byte[] getClientDataJSON() {
        throw new UnsupportedOperationException();
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public int getErrorCodeAsInt() {
        return errorCode.getCode();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthenticatorErrorResponse)) return false;

        AuthenticatorErrorResponse that = (AuthenticatorErrorResponse) o;

        if (errorCode != null ? !errorCode.equals(that.errorCode) : that.errorCode != null) return false;
        return errorMessage != null ? errorMessage.equals(that.errorMessage) : that.errorMessage == null;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{errorCode, errorMessage});
    }

    @Override
    public String toString() {
        return ToStringHelper.name("AuthenticatorErrorResponse")
                .value(errorCode.name())
                .value(errorMessage)
                .end();
    }

    public static AuthenticatorErrorResponse deserializeFromBytes(byte[] serializedBytes) {
        return SafeParcelableSerializer.deserializeFromBytes(serializedBytes, CREATOR);
    }

    public static final Creator<AuthenticatorErrorResponse> CREATOR = new AutoCreator<>(AuthenticatorErrorResponse.class);
}
