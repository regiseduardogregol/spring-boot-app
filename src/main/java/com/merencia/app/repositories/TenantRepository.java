package com.merencia.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.merencia.app.entities.Tenant;

public interface TenantRepository extends CrudRepository<Tenant, Long>{
}
