package com.nyagoogle.android.gms.common.internal;

import com.nyagoogle.android.gms.common.internal.GoogleCertificatesQuery;
import com.nyagoogle.android.gms.dynamic.IObjectWrapper;

interface IGoogleCertificatesApi {
    IObjectWrapper getGoogleCertificates();
    IObjectWrapper getGoogleReleaseCertificates();
    boolean isGoogleReleaseSigned(String packageName, IObjectWrapper certData);
    boolean isGoogleSigned(String packageName, IObjectWrapper certData);
    boolean isGoogleOrPlatformSigned(in GoogleCertificatesQuery query, IObjectWrapper packageManager);
}