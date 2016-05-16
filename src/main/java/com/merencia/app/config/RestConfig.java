package com.merencia.app.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class RestConfig extends ResourceConfig {
	public RestConfig() {
		packages( "com.merencia.app.controllers" );
	}
}