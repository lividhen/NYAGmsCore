package com.nyagoogle.android.gms.drive.internal;

import com.nyagoogle.android.gms.drive.internal.IRealtimeService;

import com.nyagoogle.android.gms.drive.internal.DownloadProgressResponse;
import com.nyagoogle.android.gms.drive.internal.ListEntriesResponse;
import com.nyagoogle.android.gms.drive.internal.DriveIdResponse;
import com.nyagoogle.android.gms.drive.internal.MetadataResponse;
import com.nyagoogle.android.gms.drive.internal.ContentsResponse;
import com.nyagoogle.android.gms.drive.internal.ListParentsResponse;
import com.nyagoogle.android.gms.drive.internal.SyncMoreResponse;
import com.nyagoogle.android.gms.drive.internal.LoadRealtimeResponse;
import com.nyagoogle.android.gms.drive.internal.ResourceIdSetResponse;
import com.nyagoogle.android.gms.drive.internal.DrivePreferencesResponse;
import com.nyagoogle.android.gms.drive.internal.DeviceUsagePreferenceResponse;
import com.nyagoogle.android.gms.drive.internal.FetchThumbnailResponse;
import com.nyagoogle.android.gms.drive.internal.ChangeSequenceNumber;
import com.nyagoogle.android.gms.drive.internal.ChangesResponse;
import com.nyagoogle.android.gms.drive.internal.GetPermissionsResponse;
import com.nyagoogle.android.gms.drive.internal.StringListResponse;
import com.nyagoogle.android.gms.drive.internal.StartStreamSession;

import com.nyagoogle.android.gms.common.api.Status;

interface IDriveServiceCallbacks {
    void onDownloadProgress(in DownloadProgressResponse response) = 0;
    void onListEntries(in ListEntriesResponse response) = 1;
    void onDriveId(in DriveIdResponse response) = 2;
    void onMetadata(in MetadataResponse response) = 3;
    void onContents(in ContentsResponse response) = 4;
    void onStatus(in Status status) = 5;
    void onSuccess() = 6;
    void onListParents(in ListParentsResponse response) = 7;
    void onSyncMore(in SyncMoreResponse response) = 8;

    void onLoadRealtime(in LoadRealtimeResponse response, IRealtimeService realtimeService) = 10;
    void onResourceIdSet(in ResourceIdSetResponse response) = 11;
    void onDrivePreferences(in DrivePreferencesResponse response) = 12;
    void onDeviceUsagePreference(in DeviceUsagePreferenceResponse response) = 13;
    void onBooleanAnswer(boolean bool) = 14;
    void onFetchThumbnail(in FetchThumbnailResponse response) = 15;
    void onChangeSequenceNumber(in ChangeSequenceNumber csn) = 16;
    void onChanges(in ChangesResponse response) = 17;

    void onGetPermissions(in GetPermissionsResponse response) = 19;
    void onStringList(in StringListResponse response) = 20;
    void onStartStreamSession(in StartStreamSession response) = 21;
}
