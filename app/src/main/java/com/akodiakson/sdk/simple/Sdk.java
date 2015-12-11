package com.akodiakson.sdk.simple;

/*
 * Copyright (C) 2015 Andrew Erickson (akodiakson)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.os.Build;

public class Sdk {

    public static int getVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static boolean isAtLeastCurrentDevelopmentVersion(){
        return getVersion() >= Build.VERSION_CODES.CUR_DEVELOPMENT;
    }

    public static boolean isAtLeastMarshmallow() {
        return getVersion() >= Build.VERSION_CODES.M;
    }

    public static boolean isAtLeastLollipopMR1() {
        return getVersion() >= Build.VERSION_CODES.LOLLIPOP_MR1;
    }

    public static boolean isAtLeastLollipop() {
        return getVersion() >= Build.VERSION_CODES.LOLLIPOP;
    }

    public static boolean isAtLeastKitKat() {
        return getVersion() >= Build.VERSION_CODES.KITKAT;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }

    public static boolean isAtLeastJellyBean() {
        return getVersion() >= Build.VERSION_CODES.JELLY_BEAN;
    }

    public static boolean isAtLeastICSMR1() {
        return getVersion() >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1;
    }

    public static boolean isAtLeastICS() {
        return getVersion() >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
    }

    public static boolean isAtLeastHoneycombMR2() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB_MR2;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB_MR1;
    }

    public static boolean isAtLeastHoneycomb() {
        return getVersion() >= Build.VERSION_CODES.HONEYCOMB;
    }

    public static boolean isAtLeastGingerbreadMR1() {
        return getVersion() >= Build.VERSION_CODES.GINGERBREAD_MR1;
    }

    public static boolean isAtLeastGingerbread() {
        return getVersion() >= Build.VERSION_CODES.GINGERBREAD;
    }
}
