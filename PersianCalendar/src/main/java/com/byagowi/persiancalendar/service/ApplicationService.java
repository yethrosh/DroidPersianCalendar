//package com.byagowi.persiancalendar.service;
//
//import android.app.Service;
//import android.content.Intent;
//import android.content.IntentFilter;
//import android.os.IBinder;
//import android.support.annotation.Nullable;
//import android.util.Log;
//
//import com.byagowi.persiancalendar.util.UpdateUtils;
//import com.byagowi.persiancalendar.util.Utils;
//
//import java.lang.ref.WeakReference;
//import java.util.concurrent.TimeUnit;
//
//import androidx.work.PeriodicWorkRequest;
//import androidx.work.WorkManager;
//
///**
// * The Calendar Service that updates widget time and clock and build/update
// * calendar notification.
// *
// * @author Ebrahim Byagowi <ebrahim@byagowi.com>
// */
//public class ApplicationService extends Service {
//
//    private static WeakReference<ApplicationService> instance;
//
//    @Nullable
//    public static ApplicationService getInstance() {
//        return instance == null ? null : instance.get();
//    }
//
//    @Override
//    public IBinder onBind(Intent paramIntent) {
//        return null;
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        instance = new WeakReference<>(this);
//        Log.d(ApplicationService.class.getName(), "start");
//
//        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction(Intent.ACTION_DATE_CHANGED);
//        intentFilter.addAction(Intent.ACTION_TIMEZONE_CHANGED);
//        intentFilter.addAction(Intent.ACTION_TIME_CHANGED);
//        intentFilter.addAction(Intent.ACTION_SCREEN_ON);
//        intentFilter.addAction(Intent.ACTION_TIME_TICK);
//        registerReceiver(new BroadcastReceivers(), intentFilter);
//
//        Utils.updateStoredPreference(getApplicationContext());
//        Utils.loadApp(this);
//        UpdateUtils.update(getApplicationContext(), true);
//
//        return START_STICKY;
//    }
//}
