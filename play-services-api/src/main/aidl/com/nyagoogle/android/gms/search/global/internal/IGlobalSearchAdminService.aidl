package com.nyagoogle.android.gms.search.global.internal;

import com.nyagoogle.android.gms.search.global.GetCurrentExperimentIdsRequest;
import com.nyagoogle.android.gms.search.global.GetGlobalSearchSourcesRequest;
import com.nyagoogle.android.gms.search.global.GetPendingExperimentIdsRequest;
import com.nyagoogle.android.gms.search.global.SetExperimentIdsRequest;
import com.nyagoogle.android.gms.search.global.SetIncludeInGlobalSearchRequest;
import com.nyagoogle.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;

interface IGlobalSearchAdminService {
    void getGlobalSearchSources(in GetGlobalSearchSourcesRequest request, IGlobalSearchAdminCallbacks callbacks) = 1;
    void setExperimentIds(in SetExperimentIdsRequest request, IGlobalSearchAdminCallbacks callbacks) = 2;
    void getCurrentExperimentIds(in GetCurrentExperimentIdsRequest request, IGlobalSearchAdminCallbacks callbacks) = 3;
    void getPendingExperimentIds(in GetPendingExperimentIdsRequest request, IGlobalSearchAdminCallbacks callbacks) = 4;

    void setIncludeInGlobalSearch(in SetIncludeInGlobalSearchRequest request, IGlobalSearchAdminCallbacks callbacks) = 7;
}
