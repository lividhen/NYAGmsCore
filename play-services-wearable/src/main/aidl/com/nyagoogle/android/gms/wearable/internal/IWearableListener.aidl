package com.nyagoogle.android.gms.wearable.internal;

import com.nyagoogle.android.gms.common.data.DataHolder;
import com.nyagoogle.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.nyagoogle.android.gms.wearable.internal.AncsNotificationParcelable;
import com.nyagoogle.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.nyagoogle.android.gms.wearable.internal.ChannelEventParcelable;
import com.nyagoogle.android.gms.wearable.internal.MessageEventParcelable;
import com.nyagoogle.android.gms.wearable.internal.NodeParcelable;

interface IWearableListener {
    void onDataChanged(in DataHolder data) = 0;
    void onMessageReceived(in MessageEventParcelable messageEvent) = 1;
    void onPeerConnected(in NodeParcelable node) = 2;
    void onPeerDisconnected(in NodeParcelable node) = 3;
    void onConnectedNodes(in List<NodeParcelable> nodes) = 4;
    void onNotificationReceived(in AncsNotificationParcelable notification) = 5;
    void onChannelEvent(in ChannelEventParcelable channelEvent) = 6;
    void onConnectedCapabilityChanged(in CapabilityInfoParcelable capabilityInfo) = 7;
    void onEntityUpdate(in AmsEntityUpdateParcelable update) = 8;
}
