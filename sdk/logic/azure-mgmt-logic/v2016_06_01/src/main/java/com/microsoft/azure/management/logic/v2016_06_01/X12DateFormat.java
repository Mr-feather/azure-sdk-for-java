/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for X12DateFormat.
 */
public enum X12DateFormat {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value CCYYMMDD. */
    CCYYMMDD("CCYYMMDD"),

    /** Enum value YYMMDD. */
    YYMMDD("YYMMDD");

    /** The actual serialized value for a X12DateFormat instance. */
    private String value;

    X12DateFormat(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a X12DateFormat instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed X12DateFormat object, or null if unable to parse.
     */
    @JsonCreator
    public static X12DateFormat fromString(String value) {
        X12DateFormat[] items = X12DateFormat.values();
        for (X12DateFormat item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}