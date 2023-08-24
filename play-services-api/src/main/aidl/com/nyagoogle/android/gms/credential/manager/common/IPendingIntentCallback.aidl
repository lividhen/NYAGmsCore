/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.credential.manager.common;

import com.nyagoogle.android.gms.common.api.Status;

interface IPendingIntentCallback {
    void onPendingIntent(in Status status, in PendingIntent pendingIntent);
}