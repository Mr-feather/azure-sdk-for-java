/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;

/**
 * The QuickTestImageUrlOptionalParameter model.
 */
public class QuickTestImageUrlOptionalParameter {
    /**
     * Optional. Specifies the id of a particular iteration to evaluate
     * against.
     * The default iteration for the project will be used when not specified.
     */
    private UUID iterationId;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the iterationId value.
     *
     * @return the iterationId value
     */
    public UUID iterationId() {
        return this.iterationId;
    }

    /**
     * Set the iterationId value.
     *
     * @param iterationId the iterationId value to set
     * @return the QuickTestImageUrlOptionalParameter object itself.
     */
    public QuickTestImageUrlOptionalParameter withIterationId(UUID iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the QuickTestImageUrlOptionalParameter object itself.
     */
    public QuickTestImageUrlOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
