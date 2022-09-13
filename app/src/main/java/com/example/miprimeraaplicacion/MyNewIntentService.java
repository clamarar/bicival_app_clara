package com.example.miprimeraaplicacion;

import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.JobIntentService;
import android.support.v4.app.NotificationManagerCompat;

public class MyNewIntentService extends JobIntentService {
    private static final int NOTIFICATION_ID = 3;



    @Override
    protected void onHandleWork(Intent intent) {
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("Recordatorio de uso Bicival App");
        builder.setContentText("Llevamos unos días sin verte por aquí, recuerda registrar tus desplazamientos en nuestra APP. ¡Muchas gracias!");
        Intent notifyIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 2, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        //to be able to launch your activity from the notification
        builder.setContentIntent(pendingIntent);
        Notification notificationCompat = builder.build();
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(NOTIFICATION_ID, notificationCompat);
    }
}
