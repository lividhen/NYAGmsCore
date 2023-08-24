package com.nyagoogle.android.auth;

import android.os.Bundle;
import android.accounts.Account;

import com.nyagoogle.android.gms.auth.AccountChangeEventsResponse;
import com.nyagoogle.android.gms.auth.AccountChangeEventsRequest;
import com.nyagoogle.android.gms.auth.GetHubTokenRequest;
import com.nyagoogle.android.gms.auth.GetHubTokenInternalResponse;
import com.nyagoogle.android.gms.auth.HasCababilitiesRequest;

interface IAuthManagerService {
    Bundle getToken(String accountName, String scope, in Bundle extras) = 0;
    Bundle clearToken(String token, in Bundle extras) = 1;
    AccountChangeEventsResponse getChangeEvents(in AccountChangeEventsRequest request) = 2;

    Bundle getTokenWithAccount(in Account account, String scope, in Bundle extras) = 4;
    Bundle getAccounts(in Bundle extras) = 5;
    Bundle removeAccount(in Account account) = 6;
    Bundle requestGoogleAccountsAccess(String packageName) = 7;
    int hasCapabilities(in HasCababilitiesRequest request) = 8;
    GetHubTokenInternalResponse getHubToken(in GetHubTokenRequest request, in Bundle extras) = 9;
}
