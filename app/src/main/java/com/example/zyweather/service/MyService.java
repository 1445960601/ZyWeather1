package com.example.zyweather.service;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        //sggfcvf
      return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        updateWeather();
        updateBingPic();
        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        return super.onStartCommand(intent, flags, startId);
    }

    private void updateWeather() {
    }
    private void updateBingPic(){

    }
}
