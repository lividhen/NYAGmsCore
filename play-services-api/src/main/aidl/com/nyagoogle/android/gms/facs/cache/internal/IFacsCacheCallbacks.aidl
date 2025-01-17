package com.nyagoogle.android.gms.facs.cache.internal;

import com.nyagoogle.android.gms.common.api.Status;
import com.nyagoogle.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.nyagoogle.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.nyagoogle.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.nyagoogle.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

interface IFacsCacheCallbacks {
    void onForceSettingsCacheRefreshResult(in Status status, in ForceSettingsCacheRefreshResult result) = 0;
    void onUpdateActivityControlsSettingsResult(in Status status, in UpdateActivityControlsSettingsResult result) = 1;
    void onGetActivityControlsSettingsResult(in Status status, in GetActivityControlsSettingsResult result) = 2;
    void onWriteDeviceLevelSettingsResult(in Status status) = 3;
    void onReadDeviceLevelSettingsResult(in Status status, in ReadDeviceLevelSettingsResult result) = 4;
}
