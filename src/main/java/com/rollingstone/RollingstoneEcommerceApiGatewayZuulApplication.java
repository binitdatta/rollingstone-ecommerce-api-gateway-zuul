package com.rollingstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class RollingstoneEcommerceApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollingstoneEcommerceApiGatewayZuulApplication.class, args);
	}
}
