package com.merencia.app.client;

import com.merencia.app.entities.Tenant;

import feign.Headers;
import feign.RequestLine;

public interface TenantClient {
	@RequestLine("POST /api/tenants")
	@Headers("Content-Type: application/json")
	Tenant createTeantn();
}
