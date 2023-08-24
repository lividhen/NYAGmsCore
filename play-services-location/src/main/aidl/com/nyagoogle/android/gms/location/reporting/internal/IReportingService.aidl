package com.nyagoogle.android.gms.location.reporting.internal;

import android.accounts.Account;
//import com.nyagoogle.android.gms.location.places.PlaceReport;
import com.nyagoogle.android.gms.location.reporting.OptInRequest;
import com.nyagoogle.android.gms.location.reporting.ReportingState;
import com.nyagoogle.android.gms.location.reporting.SendDataRequest;
import com.nyagoogle.android.gms.location.reporting.UlrPrivateModeRequest;
import com.nyagoogle.android.gms.location.reporting.UploadRequest;
import com.nyagoogle.android.gms.location.reporting.UploadRequestResult;

interface IReportingService {
    ReportingState getReportingState(in Account account) = 0;
    int tryOptInAccount(in Account account) = 1;
    UploadRequestResult requestUpload(in UploadRequest request) = 2;
    int cancelUploadRequest(long l) = 3;
//    int reportDeviceAtPlace(in Account account, in PlaceReport report) = 4;
    int tryOptIn(in OptInRequest request) = 5;
    int sendData(in SendDataRequest request) = 6;
    int requestPrivateMode(in UlrPrivateModeRequest request) = 7;
}
