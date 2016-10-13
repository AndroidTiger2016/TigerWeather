package com.tigerweather.app.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.tigerweather.app.service.AutoUpdateService;



/**
 * Created by hunanmushifengwenhuachuanmeiyouxiangongsi on 16/10/13.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}

