/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Operation status job extended info.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationStatusJobExtendedInfo")
public class OperationStatusJobExtendedInfo extends OperationStatusExtendedInfo {
    /**
     * ID of the job created for this protected item.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * Get iD of the job created for this protected item.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set iD of the job created for this protected item.
     *
     * @param jobId the jobId value to set
     * @return the OperationStatusJobExtendedInfo object itself.
     */
    public OperationStatusJobExtendedInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

}