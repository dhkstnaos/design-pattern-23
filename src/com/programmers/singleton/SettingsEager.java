package com.programmers.singleton;

public class SettingsEager {
    private static final SettingsEager INSTANCE = new SettingsEager();
    private SettingsEager() {}
    public static SettingsEager getInstance() {
        return INSTANCE;
    }
}
