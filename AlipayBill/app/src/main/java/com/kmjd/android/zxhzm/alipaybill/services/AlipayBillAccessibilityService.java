package com.kmjd.android.zxhzm.alipaybill.services;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class AlipayBillAccessibilityService extends AccessibilityService {
    private static final String TAG = "Android-Star";
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.e(TAG, "onAccessibilityEvent: "+event.getClassName().toString());

    }

    @Override
    public void onInterrupt() {

    }
}
