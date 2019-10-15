/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.management.network.v2019_08_01.PolicySettings;
import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.WebApplicationFirewallCustomRule;
import com.microsoft.azure.management.network.v2019_08_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_08_01.WebApplicationFirewallPolicyResourceState;
import com.microsoft.azure.management.network.v2019_08_01.ManagedRulesDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Defines web application firewall policy.
 */
@JsonFlatten
@SkipParentValidation
public class WebApplicationFirewallPolicyInner extends Resource {
    /**
     * Describes policySettings for policy.
     */
    @JsonProperty(value = "properties.policySettings")
    private PolicySettings policySettings;

    /**
     * Describes custom rules inside the policy.
     */
    @JsonProperty(value = "properties.customRules")
    private List<WebApplicationFirewallCustomRule> customRules;

    /**
     * A collection of references to application gateways.
     */
    @JsonProperty(value = "properties.applicationGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationGatewayInner> applicationGateways;

    /**
     * The provisioning state of the web application firewall policy resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Resource status of the policy.
     * Resource status of the policy. Possible values include: 'Creating',
     * 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private WebApplicationFirewallPolicyResourceState resourceState;

    /**
     * Describes the managedRules structure.
     */
    @JsonProperty(value = "properties.managedRules", required = true)
    private ManagedRulesDefinition managedRules;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get describes policySettings for policy.
     *
     * @return the policySettings value
     */
    public PolicySettings policySettings() {
        return this.policySettings;
    }

    /**
     * Set describes policySettings for policy.
     *
     * @param policySettings the policySettings value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withPolicySettings(PolicySettings policySettings) {
        this.policySettings = policySettings;
        return this;
    }

    /**
     * Get describes custom rules inside the policy.
     *
     * @return the customRules value
     */
    public List<WebApplicationFirewallCustomRule> customRules() {
        return this.customRules;
    }

    /**
     * Set describes custom rules inside the policy.
     *
     * @param customRules the customRules value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withCustomRules(List<WebApplicationFirewallCustomRule> customRules) {
        this.customRules = customRules;
        return this;
    }

    /**
     * Get a collection of references to application gateways.
     *
     * @return the applicationGateways value
     */
    public List<ApplicationGatewayInner> applicationGateways() {
        return this.applicationGateways;
    }

    /**
     * Get the provisioning state of the web application firewall policy resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get resource status of the policy. Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @return the resourceState value
     */
    public WebApplicationFirewallPolicyResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get describes the managedRules structure.
     *
     * @return the managedRules value
     */
    public ManagedRulesDefinition managedRules() {
        return this.managedRules;
    }

    /**
     * Set describes the managedRules structure.
     *
     * @param managedRules the managedRules value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withManagedRules(ManagedRulesDefinition managedRules) {
        this.managedRules = managedRules;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

}