package com.akodiakson.sdk;

import android.os.Build;

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

public class SdkImpl implements Sdk {

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
