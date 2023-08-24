package com.nyagoogle.android.gms.search.global.internal;

import com.nyagoogle.android.gms.search.global.GetCurrentExperimentIdsResponse;
import com.nyagoogle.android.gms.search.global.GetGlobalSearchSourcesResponse;
import com.nyagoogle.android.gms.search.global.GetPendingExperimentIdsResponse;
import com.nyagoogle.android.gms.search.global.SetExperimentIdsResponse;
import com.nyagoogle.android.gms.search.global.SetIncludeInGlobalSearchResponse;

interface IGlobalSearchAdminCallbacks {
    void onGetGlobalSearchSourcesResponse(in GetGlobalSearchSourcesResponse request) = 1;
    void onSetExperimentIdsResponse(in SetExperimentIdsResponse response) = 2;
    void onGetCurrentExperimentIdsResponse(in GetCurrentExperimentIdsResponse response) = 3;
    void onGetPendingExperimentIdsResponse(in GetPendingExperimentIdsResponse response) = 4;

    void onSetIncludeInGlobalSearchResponse(in SetIncludeInGlobalSearchResponse response) = 7;
}
