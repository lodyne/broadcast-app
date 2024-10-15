package com.example.broadcastapp;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);

            String sms = isAirplaneModeOn? "Airplane Mode is ON":"Airplane Mode is OFF";

            Toast.makeText(context, " "+sms, Toast.LENGTH_SHORT).show();

        }

    }
}
