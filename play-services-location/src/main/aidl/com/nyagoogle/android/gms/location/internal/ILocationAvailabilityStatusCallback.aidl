package com.nyagoogle.android.gms.location.internal;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.location.LocationAvailability;

interface ILocationAvailabilityStatusCallback {
    void onLocationAvailabilityStatus(in Status status, in LocationAvailability location);
}
