package com.akodiakson.sdk;

import android.os.Build;

public class Sdk implements SdkContract {

    private static Sdk INSTANCE = new Sdk();

    Sdk() {
    }

    public static Sdk getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Sdk();
        }
        return INSTANCE;
    }

    @Override
    public int getVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @Override
    public boolean isAtLeastMarshmallow() {
        return getVersion() >= Build.VERSION_CODES.M;
    }

    @Override
    public boolean isAtLeastLollipopMR1() {
        return getVersion() >= Build.VERSION_CODES.LOLLIPOP_MR1;
    }

    @Override
    public boolean isAtLeastLollipop() {
        return getVersion() >= Build.VERSION_CODES.LOLLIPOP;
    }

    @Override
    public boolean isAtLeastKitKat() {
        return getVersion() >= Build.VERSION_CODES.KITKAT;
    }

    @Override
    public boolean isAtLeastJellyBeanMR2() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    @Override
    public boolean isAtLeastJellyBeanMR1() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }

    @Override
    public boolean isAtLeastJellyBean() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN;
    }

    @Override
    public boolean isAtLeastICSMR1() {
        return getVersion() >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1;
    }

    @Override
    public boolean isAtLeastICS() {
        return getVersion() >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }

    @Override
    public boolean isAtLeastHoneycombMR2() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB_MR2;
    }

    @Override
    public boolean isAtLeastHoneycombMR1() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    @Override
    public boolean isAtLeastHoneycomb() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB;
    }

    @Override
    public boolean isAtLeastGingerbreadMR1() {
        return getVersion() >= Build.VERSION_CODES.GINGERBREAD_MR1;
    }

    @Override
    public boolean isAtLeastGingerbread() {
        return getVersion() >= Build.VERSION_CODES.GINGERBREAD;
    }
}
