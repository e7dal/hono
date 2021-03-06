/**
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.hono.adapter.http.quarkus;

import org.eclipse.hono.adapter.http.HttpProtocolAdapterProperties;
import org.eclipse.hono.client.RequestResponseClientConfigProperties;
import org.eclipse.hono.config.ApplicationConfigProperties;
import org.eclipse.hono.config.ServerConfig;

import io.quarkus.arc.config.ConfigProperties;

/**
 * Configuration properties for the HTTP adapter.
 */
@ConfigProperties(prefix = "hono", namingStrategy = ConfigProperties.NamingStrategy.VERBATIM, failOnMismatchingMember = false)
public class HonoConfig {

     public CommandConfig command;

     public HealthCheckConfig healthCheck;

     public ApplicationConfig app;

     public HttpConfig http;

     public CredentialsClientConfig credentials;

     public DeviceConnectionConfig deviceConnection;

     public DownstreamSenderConfig messaging;

     public RegistrationClientConfig registration;

     public TenantClientConfig tenant;

     /**
      * Command configuration.
      */
     @ConfigProperties(prefix = "hono.command", failOnMismatchingMember = false)
     public static class CommandConfig extends RequestResponseClientConfigProperties { }

     /**
      * Health check configuration.
      */
     @ConfigProperties(prefix = "hono.health-check", failOnMismatchingMember = false)
     public static class HealthCheckConfig extends ServerConfig { }

     /**
      * Application configuration.
      */
     @ConfigProperties(prefix = "hono.app", failOnMismatchingMember = false)
     public static class ApplicationConfig extends ApplicationConfigProperties { }

     /**
      * Http endpoint configuration.
      */
     @ConfigProperties(prefix = "hono.adapter", failOnMismatchingMember = false)
     public static class HttpConfig extends HttpProtocolAdapterProperties { }

     /**
      * Credentials client configuration.
      */
     @ConfigProperties(prefix = "hono.credentials", failOnMismatchingMember = false)
     public static class CredentialsClientConfig extends RequestResponseClientConfigProperties { }

     /**
      * Device connection client configuration.
      */
     @ConfigProperties(prefix = "hono.device-connection", failOnMismatchingMember = false)
     public static class DeviceConnectionConfig extends RequestResponseClientConfigProperties { }

     /**
      * Messaging client configuration.
      */
     @ConfigProperties(prefix = "hono.messaging", failOnMismatchingMember = false)
     public static class DownstreamSenderConfig extends RequestResponseClientConfigProperties { }

     /**
      * Device registration client configuration.
      */
     @ConfigProperties(prefix = "hono.registration", failOnMismatchingMember = false)
     public static class RegistrationClientConfig extends RequestResponseClientConfigProperties { }

     /**
      * Tenant client configuration.
      */
     @ConfigProperties(prefix = "hono.tenant", failOnMismatchingMember = false)
     public static class TenantClientConfig extends RequestResponseClientConfigProperties { }
}
