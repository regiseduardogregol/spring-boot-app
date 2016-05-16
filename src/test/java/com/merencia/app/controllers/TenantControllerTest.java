package com.merencia.app.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.merencia.app.client.ClientBuilder;
import com.merencia.app.client.TenantClient;
import com.merencia.app.config.Application;
import com.merencia.app.entities.Tenant;

@WebIntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TenantControllerTest {

	TenantClient client = ClientBuilder.build(TenantClient.class);
	
	@Test
	public void testCreateTenant(){
		Tenant tenant = client.createTeantn();
		
		assertNotNull(tenant);
		assertNotNull(tenant.getId());
	}
}
