package com.infosys.infytel.customer.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;

import reactor.core.publisher.Flux;

class CustInstanceSupplier implements ServiceInstanceListSupplier {
	    private final String serviceId;

	    public CustInstanceSupplier(String serviceId) {
	        this.serviceId = serviceId;
	    }

	    @Override
	    public String getServiceId() {
	        return serviceId;
	    }

	    @Override
	        public Flux<List<ServiceInstance>> get() {
	          return Flux.just(Arrays
	            .asList(new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8300, false),
	              new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 8301, false)));
	    }
	}