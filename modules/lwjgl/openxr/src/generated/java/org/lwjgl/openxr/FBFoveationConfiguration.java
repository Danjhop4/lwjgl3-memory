/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_foveation_configuration">XR_FB_foveation_configuration</a> extension.
 * 
 * <p>On Facebook HMDs, developers <b>may</b> create foveation profiles generated by the runtime for the optical properties and performance profile of the specific HMD.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to request foveation profiles generated by the runtime for the current HMD.</li>
 * </ul>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo} {@code enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public final class FBFoveationConfiguration {

    /** The extension specification version. */
    public static final int XR_FB_foveation_configuration_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_FOVEATION_CONFIGURATION_EXTENSION_NAME = "XR_FB_foveation_configuration";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB = 1000115000;

    /**
     * XrFoveationLevelFB - Foveation levels
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FOVEATION_LEVEL_NONE_FB FOVEATION_LEVEL_NONE_FB} — No foveation</li>
     * <li>{@link #XR_FOVEATION_LEVEL_LOW_FB FOVEATION_LEVEL_LOW_FB} — Less foveation (higher periphery visual fidelity, lower performance)</li>
     * <li>{@link #XR_FOVEATION_LEVEL_MEDIUM_FB FOVEATION_LEVEL_MEDIUM_FB} — Medium foveation (medium periphery visual fidelity, medium performance)</li>
     * <li>{@link #XR_FOVEATION_LEVEL_HIGH_FB FOVEATION_LEVEL_HIGH_FB} — High foveation (lower periphery visual fidelity, higher performance)</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFoveationLevelProfileCreateInfoFB}</p>
     */
    public static final int
        XR_FOVEATION_LEVEL_NONE_FB   = 0,
        XR_FOVEATION_LEVEL_LOW_FB    = 1,
        XR_FOVEATION_LEVEL_MEDIUM_FB = 2,
        XR_FOVEATION_LEVEL_HIGH_FB   = 3;

    /**
     * XrFoveationDynamicFB - Dynamic foveation settings
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FOVEATION_DYNAMIC_DISABLED_FB FOVEATION_DYNAMIC_DISABLED_FB} — Static foveation at the maximum desired level</li>
     * <li>{@link #XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_FB FOVEATION_DYNAMIC_LEVEL_ENABLED_FB} — Dynamic changing foveation based on performance headroom available up to the maximum desired level</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFoveationLevelProfileCreateInfoFB}</p>
     */
    public static final int
        XR_FOVEATION_DYNAMIC_DISABLED_FB      = 0,
        XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_FB = 1;

    private FBFoveationConfiguration() {}

}