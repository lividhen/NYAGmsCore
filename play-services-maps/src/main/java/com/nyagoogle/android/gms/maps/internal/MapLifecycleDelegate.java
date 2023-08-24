/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.maps.internal;

import androidx.annotation.NonNull;
import com.nyagoogle.android.gms.dynamic.LifecycleDelegate;
import com.nyagoogle.android.gms.maps.OnMapReadyCallback;

public interface MapLifecycleDelegate extends LifecycleDelegate {
    void getMapAsync(@NonNull OnMapReadyCallback callback);
}
