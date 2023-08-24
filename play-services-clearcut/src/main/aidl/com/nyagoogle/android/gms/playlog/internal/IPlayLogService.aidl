package com.nyagoogle.android.gms.playlog.internal;

import com.nyagoogle.android.gms.clearcut.internal.PlayLoggerContext;
import com.nyagoogle.android.gms.playlog.internal.LogEvent;

// Deprecated
interface IPlayLogService {
    void onEvent(String packageName, in PlayLoggerContext context, in LogEvent event) = 1;
    void onMultiEvent(String packageName, in PlayLoggerContext context, in List<LogEvent> events) = 2;
}
