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

package org.microg.gms;

import android.os.RemoteException;

import com.nyagoogle.android.gms.common.ConnectionResult;
import com.nyagoogle.android.gms.common.internal.GetServiceRequest;
import com.nyagoogle.android.gms.common.internal.IGmsCallbacks;

import org.microg.gms.common.GmsService;

public class DummyService extends BaseService {
    public DummyService() {
        super("GmsDummySvc", GmsService.ANY);
    }

    @Override
    public void handleServiceRequest(IGmsCallbacks callback, GetServiceRequest request, GmsService service) throws RemoteException {
        callback.onPostInitComplete(ConnectionResult.API_DISABLED, null, null);
    }
}
