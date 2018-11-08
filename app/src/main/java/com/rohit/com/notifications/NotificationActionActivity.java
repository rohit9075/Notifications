package com.rohit.com.notifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NotificationActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_action);

        Toast.makeText(this, "Tapped on Notification", Toast.LENGTH_SHORT).show();
    }
}
