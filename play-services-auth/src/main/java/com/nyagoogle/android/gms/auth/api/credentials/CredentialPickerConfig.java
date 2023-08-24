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
public class CredentialPickerConfig extends AutoSafeParcelable {

    @SafeParcelable.Field(1000)
    private int versionCode = 1;

    @SafeParcelable.Field(1)
    private boolean showAddAccountButton;
    @SafeParcelable.Field(2)
    private boolean showCancelButton;
    @SafeParcelable.Field(3)
    private boolean forNewAccount;

    private CredentialPickerConfig() {
    }

    public CredentialPickerConfig(boolean showAddAccountButton, boolean showCancelButton, boolean forNewAccount) {
        this.showAddAccountButton = showAddAccountButton;
        this.showCancelButton = showCancelButton;
        this.forNewAccount = forNewAccount;
    }

    /**
     * @deprecated It was determined that this method was not useful for developers.
     */
    @Deprecated
    public boolean isForNewAccount() {
        return forNewAccount;
    }

    public boolean shouldShowAddAccountButton() {
        return showAddAccountButton;
    }

    public boolean shouldShowCancelButton() {
        return showCancelButton;
    }

    @Override
    public String toString() {
        return "CredentialPickerConfig{" +
                "showAddAccountButton=" + showAddAccountButton +
                ", showCancelButton=" + showCancelButton +
                '}';
    }

    public class Builder {
        private boolean showAddAccountButton;
        private boolean showCancelButton;
        private boolean forNewAccount;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(showAddAccountButton, showCancelButton, forNewAccount);
        }

        /**
         * Sets whether the hint request is for a new account sign-up flow.
         */
        public Builder setForNewAccount(boolean forNewAccount) {
            this.forNewAccount = forNewAccount;
            return this;
        }

        /**
         * Sets whether the add account button should be shown in credential picker dialog.
         */
        public Builder setShowAddAccountButton(boolean showAddAccountButton) {
            this.showAddAccountButton = showAddAccountButton;
            return this;
        }

        /**
         * Sets whether the cancel button should be shown in credential picker dialog.
         */
        public Builder setShowCancelButton(boolean showCancelButton) {
            this.showCancelButton = showCancelButton;
            return this;
        }
    }

    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new AutoCreator<CredentialPickerConfig>(CredentialPickerConfig.class);
}
