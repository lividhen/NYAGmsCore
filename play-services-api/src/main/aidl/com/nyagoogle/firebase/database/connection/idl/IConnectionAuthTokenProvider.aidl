package com.nyagoogle.firebase.database.connection.idl;

import com.nyagoogle.firebase.database.connection.idl.IGetTokenCallback;

interface IConnectionAuthTokenProvider {
    void zero(boolean var1, IGetTokenCallback var2) = 0;
}