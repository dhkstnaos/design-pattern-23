package com.programmers.singleton;

public class SettingsInner {
    private SettingsInner() {}

    private static class SettingsHolder {
        private static final SettingsInner INSTANCE = new SettingsInner();
    }

    public static SettingsInner getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
