package com.prinitta.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_notification)
        button.setOnClickListener {
            val builder = NotificationCompat.Builder(this, "idk")
                .setSmallIcon(R.drawable.ic_baseline_airline_seat_individual_suite_24)
                .setContentTitle("Hora de dormir!")
                .setContentText("Dormir dá fome e comer dá sono...")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            NotificationManagerCompat.from(this).notify(1, builder.build())
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel("idk", "main",NotificationManager.IMPORTANCE_DEFAULT).apply {
                description = "testando..."
            }
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }


}