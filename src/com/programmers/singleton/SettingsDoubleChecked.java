package com.programmers.singleton;

public class SettingsDoubleChecked {
    private static volatile SettingsDoubleChecked instance;

    private SettingsDoubleChecked() {}
    public static SettingsDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SettingsDoubleChecked.class) {
                if (instance == null) {
                    instance = new SettingsDoubleChecked();
                }
            }
        }
        return instance;
    }
}
