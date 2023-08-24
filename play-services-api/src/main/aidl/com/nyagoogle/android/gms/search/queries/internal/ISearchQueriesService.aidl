package com.nyagoogle.android.gms.search.queries.internal;

import com.nyagoogle.android.gms.search.queries.QueryRequest;
import com.nyagoogle.android.gms.search.queries.internal.ISearchQueriesCallbacks;

interface ISearchQueriesService {
    void query(in QueryRequest request, ISearchQueriesCallbacks callbacks) = 1;
}
