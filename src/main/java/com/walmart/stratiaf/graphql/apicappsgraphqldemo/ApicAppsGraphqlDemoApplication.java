package com.walmart.stratiaf.graphql.apicappsgraphqldemo;

import com.walmart.stratiaf.graphql.apicappsgraphqldemo.service.AppResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.servlet.ServletContext;

@SpringBootApplication
public class ApicAppsGraphqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApicAppsGraphqlDemoApplication.class, args);
	}

/*
	@Bean
	public AppResolver appResolver(){
		return new AppResolver();
	}
*/


}
