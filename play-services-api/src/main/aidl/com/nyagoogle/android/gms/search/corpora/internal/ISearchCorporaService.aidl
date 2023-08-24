package com.nyagoogle.android.gms.search.corpora.internal;

import com.nyagoogle.android.gms.search.corpora.ClearCorpusRequest;
import com.nyagoogle.android.gms.search.corpora.GetCorpusStatusRequest;
import com.nyagoogle.android.gms.search.corpora.GetCorpusInfoRequest;
import com.nyagoogle.android.gms.search.corpora.RequestIndexingRequest;
import com.nyagoogle.android.gms.search.corpora.internal.ISearchCorporaCallbacks;

interface ISearchCorporaService {
    void requestIndexing(in RequestIndexingRequest request, ISearchCorporaCallbacks callbacks) = 1;
    void clearCorpus(in ClearCorpusRequest request, ISearchCorporaCallbacks callbacks) = 2;
    void getCorpusStatus(in GetCorpusStatusRequest request, ISearchCorporaCallbacks callbacks) = 3;
    void getCorpusInfo(in GetCorpusInfoRequest request, ISearchCorporaCallbacks callbacks) = 4;
}
