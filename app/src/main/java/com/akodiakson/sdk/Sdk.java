package com.akodiakson.sdk;

public interface Sdk {

    int getVersion();

    boolean isAtLeastMarshmallow();

    boolean isAtLeastLollipopMR1();

    boolean isAtLeastLollipop();

    boolean isAtLeastKitKat();

    boolean isAtLeastJellyBeanMR2();

    boolean isAtLeastJellyBeanMR1();

    boolean isAtLeastJellyBean();

    boolean isAtLeastICSMR1();

    boolean isAtLeastICS();

    boolean isAtLeastHoneycombMR2();

    boolean isAtLeastHoneycombMR1();

    boolean isAtLeastHoneycomb();

    boolean isAtLeastGingerbreadMR1();

    boolean isAtLeastGingerbread();
}
