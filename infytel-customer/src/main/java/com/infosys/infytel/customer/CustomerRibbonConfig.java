package com.infosys.infytel.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.infosys.infytel.customer.config.CustRibbonConfig;

@Configuration
//@LoadBalancerClient(name = "custribbon", configuration = CustRibbonConfig.class)
public class CustomerRibbonConfig {

	@Bean @LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
