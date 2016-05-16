package com.merencia.app.services;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.merencia.app.entities.Tenant;
import com.merencia.app.repositories.TenantRepository;

@Component
public class TenantService {

	@Inject
	private TenantRepository tenantRepository;
	
	public Tenant save(Tenant tenant) {
		return tenantRepository.save(tenant);
	}

}
