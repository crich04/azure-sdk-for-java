/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain credentials for setting up Windows Server Failover Cluster for SQL
 * availability group.
 */
public class WsfcDomainCredentials {
    /**
     * Cluster bootstrap account password.
     */
    @JsonProperty(value = "clusterBootstrapAccountPassword")
    private String clusterBootstrapAccountPassword;

    /**
     * Cluster operator account password.
     */
    @JsonProperty(value = "clusterOperatorAccountPassword")
    private String clusterOperatorAccountPassword;

    /**
     * SQL service account password.
     */
    @JsonProperty(value = "sqlServiceAccountPassword")
    private String sqlServiceAccountPassword;

    /**
     * Get cluster bootstrap account password.
     *
     * @return the clusterBootstrapAccountPassword value
     */
    public String clusterBootstrapAccountPassword() {
        return this.clusterBootstrapAccountPassword;
    }

    /**
     * Set cluster bootstrap account password.
     *
     * @param clusterBootstrapAccountPassword the clusterBootstrapAccountPassword value to set
     * @return the WsfcDomainCredentials object itself.
     */
    public WsfcDomainCredentials withClusterBootstrapAccountPassword(String clusterBootstrapAccountPassword) {
        this.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
        return this;
    }

    /**
     * Get cluster operator account password.
     *
     * @return the clusterOperatorAccountPassword value
     */
    public String clusterOperatorAccountPassword() {
        return this.clusterOperatorAccountPassword;
    }

    /**
     * Set cluster operator account password.
     *
     * @param clusterOperatorAccountPassword the clusterOperatorAccountPassword value to set
     * @return the WsfcDomainCredentials object itself.
     */
    public WsfcDomainCredentials withClusterOperatorAccountPassword(String clusterOperatorAccountPassword) {
        this.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
        return this;
    }

    /**
     * Get sQL service account password.
     *
     * @return the sqlServiceAccountPassword value
     */
    public String sqlServiceAccountPassword() {
        return this.sqlServiceAccountPassword;
    }

    /**
     * Set sQL service account password.
     *
     * @param sqlServiceAccountPassword the sqlServiceAccountPassword value to set
     * @return the WsfcDomainCredentials object itself.
     */
    public WsfcDomainCredentials withSqlServiceAccountPassword(String sqlServiceAccountPassword) {
        this.sqlServiceAccountPassword = sqlServiceAccountPassword;
        return this;
    }

}