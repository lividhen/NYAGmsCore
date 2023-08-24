/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 * Notice: Portions of this file are reproduced from work created and shared by Google and used
 *         according to terms described in the Creative Commons 4.0 Attribution License.
 *         See https://developers.google.com/readme/policies for details.
 */

package com.nyagoogle.firebase.auth;

import android.net.Uri;
import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.gms.common.PublicApi;
import org.microg.safeparcel.AutoSafeParcelable;

/**
 * Request used to update user profile information.
 */
@PublicApi
public class UserProfileChangeRequest extends AutoSafeParcelable {
    @SafeParcelable.Field(1)
    @PublicApi(exclude = true)
    public String displayName;
    @SafeParcelable.Field(2)
    @PublicApi(exclude = true)
    public String photoUrl;
    @SafeParcelable.Field(3)
    @PublicApi(exclude = true)
    public boolean shouldRemoveDisplayName;
    @SafeParcelable.Field(4)
    @PublicApi(exclude = true)
    public boolean shouldRemovePhotoUri;

    private UserProfileChangeRequest() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public Uri getPhotoUri() {
        return Uri.parse(photoUrl);
    }

    /**
     * The request builder.
     */
    public static class Builder {
        private String displayName;
        private Uri photoUri;
        private boolean shouldRemoveDisplayName;
        private boolean shouldRemovePhotoUri;

        /**
         * Sets the updated display name.
         * @return the {@link UserProfileChangeRequest.Builder} for chaining
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            shouldRemoveDisplayName = displayName == null;
            return this;
        }

        /**
         * Sets the updated photo {@link Uri}.
         * @return the {@link UserProfileChangeRequest.Builder} for chaining
         */
        public Builder setPhotoUri(Uri photoUri) {
            this.photoUri = photoUri;
            shouldRemovePhotoUri = photoUri == null;
            return this;
        }

        /**
         * Returns a {@link UserProfileChangeRequest} instance
         */
        public UserProfileChangeRequest build() {
            UserProfileChangeRequest request = new UserProfileChangeRequest();
            request.displayName = displayName;
            request.photoUrl = photoUri.toString();
            request.shouldRemoveDisplayName = shouldRemoveDisplayName;
            request.shouldRemovePhotoUri = shouldRemovePhotoUri;
            return request;
        }
    }

    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new AutoCreator<>(UserProfileChangeRequest.class);
}
