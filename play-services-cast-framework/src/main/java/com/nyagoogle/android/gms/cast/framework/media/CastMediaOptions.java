/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nyagoogle.android.gms.cast.framework.media;

import android.os.Parcelable;

import com.nyagoogle.android.gms.common.internal.safeparcel.SafeParcelable;

import org.microg.safeparcel.AutoSafeParcelable;

public class CastMediaOptions extends AutoSafeParcelable {

    @SafeParcelable.Field(1)
    private int versionCode = 1;
    @SafeParcelable.Field(2)
    public String mediaIntentReceiverClassName;
    @SafeParcelable.Field(3)
    public String expandedControllerActivityClassName;
    @SafeParcelable.Field(4)
    public IImagePicker imagePicker;
    @SafeParcelable.Field(5)
    public NotificationOptions notificationOptions;
    @SafeParcelable.Field(6)
    public boolean bool6;
    @SafeParcelable.Field(7)
    public boolean bool7;

    public static Parcelable.Creator<CastMediaOptions> CREATOR = new AutoCreator<CastMediaOptions>(CastMediaOptions.class);
}
