package com.nyagoogle.android.gms.search.queries.internal;

import com.nyagoogle.android.gms.search.queries.QueryResponse;

interface ISearchQueriesCallbacks {
    void onQuery(in QueryResponse response) = 1;
}
