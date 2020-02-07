package com.packmoveandgo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration 
@PropertySource("classpath:pdf-view.properties")
@ComponentScan("com.packmoveandgo.config")
public class ResolverConfig {

	 @Bean  
	   public ResourceBundleViewResolver resourceBundleViewResolver() { 
		ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
		resolver.setBasename("pdf-view");
		resolver.setOrder(1);
		return resolver;  
	   }
}
