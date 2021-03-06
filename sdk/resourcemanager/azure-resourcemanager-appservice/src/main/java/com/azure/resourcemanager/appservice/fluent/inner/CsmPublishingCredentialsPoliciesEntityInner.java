// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CsmPublishingCredentialsPoliciesEntity model. */
@JsonFlatten
@Fluent
public class CsmPublishingCredentialsPoliciesEntityInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CsmPublishingCredentialsPoliciesEntityInner.class);

    /*
     * <code>true</code> to allow access to a publishing method; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.allow")
    private Boolean allow;

    /**
     * Get the allow property: &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the allow value.
     */
    public Boolean allow() {
        return this.allow;
    }

    /**
     * Set the allow property: &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param allow the allow value to set.
     * @return the CsmPublishingCredentialsPoliciesEntityInner object itself.
     */
    public CsmPublishingCredentialsPoliciesEntityInner withAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
