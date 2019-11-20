/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation.RoleDefinitionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RoleDefinitions.
 */
public interface RoleDefinitions extends SupportsCreating<RoleDefinition.DefinitionStages.Blank>, HasInner<RoleDefinitionsInner> {
    /**
     * Deletes a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleDefinition> deleteAsync(String scope, String roleDefinitionId);

    /**
     * Get role definition by name (GUID).
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleDefinition> getAsync(String scope, String roleDefinitionId);

    /**
     * Gets a role definition by ID.
     *
     * @param roleId The fully qualified role definition ID. Use the format, /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleDefinition> getByIdAsync(String roleId);

    /**
     * Get all role definitions that are applicable at scope and above.
     *
     * @param scope The scope of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleDefinition> listAsync(final String scope);

}