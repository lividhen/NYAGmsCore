package com.nyagoogle.android.gms.checkin.internal;

interface ICheckinService {
    String getDeviceDataVersionInfo();
    long getLastCheckinSuccessTime();
    String getLastSimOperator();
}
