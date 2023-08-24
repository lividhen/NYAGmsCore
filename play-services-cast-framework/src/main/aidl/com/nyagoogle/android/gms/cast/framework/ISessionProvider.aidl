package com.nyagoogle.android.gms.cast.framework;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface ISessionProvider {
    IObjectWrapper getSession(String sessionId) = 0;
    boolean isSessionRecoverable() = 1;
    String getCategory() = 2;
    int getSupportedVersion() = 3;
}
