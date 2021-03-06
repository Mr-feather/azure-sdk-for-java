// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.containerregistry.OperationDisplayDefinition;
import com.azure.management.containerregistry.OperationServiceSpecificationDefinition;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OperationDefinition model. */
@JsonFlatten
@Fluent
public class OperationDefinitionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationDefinitionInner.class);

    /*
     * The origin information of the container registry operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The display information for the container registry operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplayDefinition display;

    /*
     * The definition of Azure Monitoring service.
     */
    @JsonProperty(value = "properties.serviceSpecification")
    private OperationServiceSpecificationDefinition serviceSpecification;

    /**
     * Get the origin property: The origin information of the container registry operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin information of the container registry operation.
     *
     * @param origin the origin value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The display information for the container registry operation.
     *
     * @return the display value.
     */
    public OperationDisplayDefinition display() {
        return this.display;
    }

    /**
     * Set the display property: The display information for the container registry operation.
     *
     * @param display the display value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withDisplay(OperationDisplayDefinition display) {
        this.display = display;
        return this;
    }

    /**
     * Get the serviceSpecification property: The definition of Azure Monitoring service.
     *
     * @return the serviceSpecification value.
     */
    public OperationServiceSpecificationDefinition serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: The definition of Azure Monitoring service.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withServiceSpecification(
        OperationServiceSpecificationDefinition serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}
