package com.nyagoogle.android.gms.gmscompliance;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.gmscompliance.GmsDeviceComplianceResponse;

interface IGmsDeviceComplianceServiceCallback {
    oneway void onResponse(in Status status, in GmsDeviceComplianceResponse response);
}
