package com.programmers.singleton;

import java.io.Serializable;

public class Settings implements Serializable {
    private static Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        if(instance==null) instance = new Settings();
        return instance;
    }
    protected Object readresolve() {
        return getInstance();
    }
}
