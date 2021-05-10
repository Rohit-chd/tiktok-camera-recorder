package com.camera.video;

import android.app.Application;


public class CameraApplication extends Application {
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

        if(level >= TRIM_MEMORY_BACKGROUND) {
        }
    }
}
