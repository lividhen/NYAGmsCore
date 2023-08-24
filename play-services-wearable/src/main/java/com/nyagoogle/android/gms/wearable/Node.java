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

import org.microg.gms.common.PublicApi;

/**
 * Information about a particular node in the Android Wear network.
 */
@PublicApi
public interface Node {
    /**
     * Returns a human readable description of the node. Sometimes generated from the Bluetooth
     * device name
     */
    String getDisplayName();

    /**
     * Returns an opaque string that represents a node in the Android Wear network.
     */
    String getId();

    /**
     * Indicates that this node can be considered geographically nearby the local node.
     */
    boolean isNearby();
}