/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Application Insights component daily data volume cap status.
 */
public class ApplicationInsightsComponentFeature {
    /**
     * The pricing feature name.
     */
    @JsonProperty(value = "FeatureName", access = JsonProperty.Access.WRITE_ONLY)
    private String featureName;

    /**
     * The meter id used for the feature.
     */
    @JsonProperty(value = "MeterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /**
     * The meter meter rate for the feature's meter.
     */
    @JsonProperty(value = "MeterRateFrequency", access = JsonProperty.Access.WRITE_ONLY)
    private String meterRateFrequency;

    /**
     * Reserved, not used now.
     */
    @JsonProperty(value = "ResouceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resouceId;

    /**
     * Reserved, not used now.
     */
    @JsonProperty(value = "IsHidden", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isHidden;

    /**
     * A list of Application Insigths component feature capability.
     */
    @JsonProperty(value = "Capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationInsightsComponentFeatureCapability> capabilities;

    /**
     * Desplay name of the feature.
     */
    @JsonProperty(value = "Title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /**
     * Whether can apply addon feature on to it.
     */
    @JsonProperty(value = "IsMainFeature", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isMainFeature;

    /**
     * The add on features on main feature.
     */
    @JsonProperty(value = "SupportedAddonFeatures", access = JsonProperty.Access.WRITE_ONLY)
    private String supportedAddonFeatures;

    /**
     * Get the pricing feature name.
     *
     * @return the featureName value
     */
    public String featureName() {
        return this.featureName;
    }

    /**
     * Get the meter id used for the feature.
     *
     * @return the meterId value
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the meter meter rate for the feature's meter.
     *
     * @return the meterRateFrequency value
     */
    public String meterRateFrequency() {
        return this.meterRateFrequency;
    }

    /**
     * Get reserved, not used now.
     *
     * @return the resouceId value
     */
    public String resouceId() {
        return this.resouceId;
    }

    /**
     * Get reserved, not used now.
     *
     * @return the isHidden value
     */
    public Boolean isHidden() {
        return this.isHidden;
    }

    /**
     * Get a list of Application Insigths component feature capability.
     *
     * @return the capabilities value
     */
    public List<ApplicationInsightsComponentFeatureCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Get desplay name of the feature.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Get whether can apply addon feature on to it.
     *
     * @return the isMainFeature value
     */
    public Boolean isMainFeature() {
        return this.isMainFeature;
    }

    /**
     * Get the add on features on main feature.
     *
     * @return the supportedAddonFeatures value
     */
    public String supportedAddonFeatures() {
        return this.supportedAddonFeatures;
    }

}