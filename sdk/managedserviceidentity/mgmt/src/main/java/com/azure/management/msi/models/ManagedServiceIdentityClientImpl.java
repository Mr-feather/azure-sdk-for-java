// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.msi.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.AzureServiceClient;

/** Initializes a new instance of the ManagedServiceIdentityClientImpl type. */
public final class ManagedServiceIdentityClientImpl extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(ManagedServiceIdentityClientImpl.class);

    /** The Id of the Subscription to which the identity belongs. */
    private String subscriptionId;

    /**
     * Gets The Id of the Subscription to which the identity belongs.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Id of the Subscription to which the identity belongs.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public ManagedServiceIdentityClientImpl setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** server parameter. */
    private String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the service client itself.
     */
    public ManagedServiceIdentityClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /** Api Version. */
    private String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself.
     */
    public ManagedServiceIdentityClientImpl setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The SystemAssignedIdentitiesInner object to access its operations. */
    private final SystemAssignedIdentitiesInner systemAssignedIdentities;

    /**
     * Gets the SystemAssignedIdentitiesInner object to access its operations.
     *
     * @return the SystemAssignedIdentitiesInner object.
     */
    public SystemAssignedIdentitiesInner systemAssignedIdentities() {
        return this.systemAssignedIdentities;
    }

    /** The OperationsInner object to access its operations. */
    private final OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     *
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /** The UserAssignedIdentitiesInner object to access its operations. */
    private final UserAssignedIdentitiesInner userAssignedIdentities;

    /**
     * Gets the UserAssignedIdentitiesInner object to access its operations.
     *
     * @return the UserAssignedIdentitiesInner object.
     */
    public UserAssignedIdentitiesInner userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /** Initializes an instance of ManagedServiceIdentityClient client. */
    public ManagedServiceIdentityClientImpl() {
        this(
            new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(),
            AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ManagedServiceIdentityClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public ManagedServiceIdentityClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ManagedServiceIdentityClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public ManagedServiceIdentityClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.systemAssignedIdentities = new SystemAssignedIdentitiesInner(this);
        this.operations = new OperationsInner(this);
        this.userAssignedIdentities = new UserAssignedIdentitiesInner(this);
    }
}
