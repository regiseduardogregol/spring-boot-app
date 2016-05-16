package com.merencia.app.client;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class ClientBuilder {
	public static <T> T build(Class<T> clientClass){
		return Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(clientClass, "http://localhost:8888");
	}
}
