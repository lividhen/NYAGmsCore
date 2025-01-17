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

package com.nyagoogle.android.gms.wearable;

import com.nyagoogle.android.gms.common.data.Freezable;

/**
 * A reference to an asset stored in a data item. Used to fetch file descriptors using
 * DataApi#getFdForAsset(GoogleApiClient, DataItemAsset).
 */
public interface DataItemAsset extends Freezable<DataItemAsset> {
    /**
     * @return the identifier used to address this asset in the context of an existing
     * {@link DataItem}.
     */
    String getDataItemKey();

    /**
     * @return the Android Wear-wide unique identifier for a particular asset.
     */
    String getId();
}
