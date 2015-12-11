package com.akodiakson.sdk;

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
