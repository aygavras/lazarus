/**Copyright 2016
 * Lazarus
 */
package com.lazarus.ecommerce.services;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.internal.JerseyResourceContext;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * @author aygavras
 *
 */
public class JerseyService extends ResourceConfig {
	/**
	 * Register JAX-RS application components.
	 */
	public JerseyService() {
		// register(RequestContextFilter.class);
		// register(JerseyResource.class);
		// register(SpringSingletonResource.class);
		register(ProductRequestResource.class);
		// register(CustomExceptionMapper.class);
	}
}
