package com.akodiakson.sdk;

import android.os.Build;

public class SdkImpl implements Sdk {


    public void example(){
        Sdk sdk = new SdkImpl();
        if(sdk.isAtLeastMarshmallow()){
            System.out.println("I'm fluffy");
        } else if(sdk.isAtLeastLollipop()){
            System.out.println("I'm sticky");
        } else if(sdk.isAtLeastKitKat()){
            System.out.println("I'm crunchy");
        }
    }
    public int getVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public boolean isAtLeastMarshmallow() {
        return getVersion() >= Build.VERSION_CODES.M;
    }

    public boolean isAtLeastLollipopMR1() {
        return getVersion() >= Build.VERSION_CODES.LOLLIPOP_MR1;
    }

    public boolean isAtLeastLollipop() {
        return getVersion() >= Build.VERSION_CODES.LOLLIPOP;
    }

    public boolean isAtLeastKitKat() {
        return getVersion() >= Build.VERSION_CODES.KITKAT;
    }

    public boolean isAtLeastJellyBeanMR2() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    public boolean isAtLeastJellyBeanMR1() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }

    public boolean isAtLeastJellyBean() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN;
    }

    public boolean isAtLeastICSMR1() {
        return getVersion() >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1;
    }

    public boolean isAtLeastICS() {
        return getVersion() >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }

    public boolean isAtLeastHoneycombMR2() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB_MR2;
    }

    public boolean isAtLeastHoneycombMR1() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    public boolean isAtLeastHoneycomb() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB;
    }

    public boolean isAtLeastGingerbreadMR1() {
        return getVersion() >= Build.VERSION_CODES.GINGERBREAD_MR1;
    }

    public boolean isAtLeastGingerbread() {
        return getVersion() >= Build.VERSION_CODES.GINGERBREAD;
    }
}
