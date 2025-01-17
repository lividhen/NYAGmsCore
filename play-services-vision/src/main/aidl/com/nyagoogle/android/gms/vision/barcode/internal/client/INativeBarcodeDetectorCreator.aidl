/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.nyagoogle.android.gms.vision.barcode.internal.client;

import com.nyagoogle.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.nyagoogle.android.gms.vision.barcode.internal.client.INativeBarcodeDetector;
import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface INativeBarcodeDetectorCreator {
    INativeBarcodeDetector create(IObjectWrapper context, in BarcodeDetectorOptions options) = 0;
}
