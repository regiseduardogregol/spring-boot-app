package com.merencia.app.controllers;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.merencia.app.entities.Tenant;
import com.merencia.app.services.TenantService;

@Component
@Path("tenants")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class TenantController {
	
	@Inject
	private TenantService tenantService;
	
	@POST
	public Tenant create(){
		return tenantService.save(new Tenant());
	}
}
