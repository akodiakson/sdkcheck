package com.akodiakson.sdk;


import android.os.Build;

import org.junit.Test;
import org.robolectric.util.ReflectionHelpers;

import static org.junit.Assert.*;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    private static final String SDK_INT_FIELD = "SDK_INT";

    @Test
    public void isAtLeastMarshmallow() throws Exception {
        ReflectionHelpers.setStaticField(Build.VERSION.class, SDK_INT_FIELD, Build.VERSION_CODES.M);
        Sdk sdk = new SdkImpl();
        assertTrue(sdk.isAtLeastLollipopMR1());
        assertTrue(sdk.isAtLeastMarshmallow());
        assertFalse(sdk.isAtLeastCurrentDevelopmentVersion());
    }

    @Test
     public void isAtLeastLollipop() throws Exception {
        ReflectionHelpers.setStaticField(Build.VERSION.class, SDK_INT_FIELD, Build.VERSION_CODES.LOLLIPOP);
        Sdk sdk = new SdkImpl();
        assertTrue(sdk.isAtLeastJellyBeanMR2());
        assertTrue(sdk.isAtLeastKitKat());
        assertTrue(sdk.isAtLeastLollipop());
        assertFalse(sdk.isAtLeastLollipopMR1());
    }

    @Test
    public void isAtLeastKitKat() throws Exception {
        ReflectionHelpers.setStaticField(Build.VERSION.class, SDK_INT_FIELD, Build.VERSION_CODES.KITKAT);
        Sdk sdk = new SdkImpl();
        assertTrue(sdk.isAtLeastJellyBeanMR2());
        assertTrue(sdk.isAtLeastKitKat());
        assertFalse(sdk.isAtLeastLollipop());
    }
}