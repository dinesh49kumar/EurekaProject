package com.infosys.infytel.customer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;

public class CustRibbonConfig {
	
	@Autowired
	LoadBalancerClient clientconfig;
	
	@Bean
	public ServiceInstanceListSupplier serviceInstanceListSupplier(){
		return  new CustInstanceSupplier("custribbon");	
	}
	

}