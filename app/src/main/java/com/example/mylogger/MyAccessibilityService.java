package com.example.mylogger;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class MyAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        String logEntry = "Event: " + event.getEventType() +
                " Package: " + event.getPackageName() +
                " Text: " + event.getText();
        FileWriterHelper.writeLog(getApplicationContext(), logEntry);
    }

    @Override
    public void onInterrupt() {}
}