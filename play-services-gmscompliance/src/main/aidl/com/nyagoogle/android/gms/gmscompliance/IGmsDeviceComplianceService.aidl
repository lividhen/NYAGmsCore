package com.nyagoogle.android.gms.gmscompliance;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback;

interface IGmsDeviceComplianceService {
    void getDeviceCompliance(IGmsDeviceComplianceServiceCallback callback);
}
