/*
 * SPDX-FileCopyrightText: 2019, e Foundation
 * SPDX-FileCopyrightText: 2021, Google LLC
 * SPDX-FileCopyrightText: 2021, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.firebase.dynamiclinks.internal;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.firebase.dynamiclinks.internal.DynamicLinkData;
import com.nyagoogle.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

interface IDynamicLinksCallbacks {
    void onStatusDynamicLinkData(in Status status, in DynamicLinkData dldata) = 0;
    void onStatusShortDynamicLink(in Status status, in ShortDynamicLinkImpl sdlink) = 1;
}
