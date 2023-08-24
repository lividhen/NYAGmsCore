package com.nyagoogle.android.gms.appinvite.internal;


import com.nyagoogle.android.gms.appinvite.internal.IAppInviteCallbacks;

import com.nyagoogle.android.gms.dynamic.IObjectWrapper;
import com.nyagoogle.android.gms.common.api.Status;


interface IAppInviteService {
    void updateInvitationOnInstall(IAppInviteCallbacks callback, String invitationId) = 0;
    void convertInvitation(IAppInviteCallbacks callback, String invitationId) = 1;
    void getInvitation(IAppInviteCallbacks callback) = 2;
}
