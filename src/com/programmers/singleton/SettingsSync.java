package com.programmers.singleton;

public class SettingsSync {
    private static SettingsSync instance;

    private SettingsSync() {}

    public static synchronized SettingsSync getInstance() {
        if(instance==null) instance = new SettingsSync();
        return instance;
    }
}
