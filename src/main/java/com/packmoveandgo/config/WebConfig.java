package com.packmoveandgo.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.CacheControl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author imssbora
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.packmoveandgo.controller",
      "com.packmoveandgo.validator" })
public class WebConfig extends WebMvcConfigurerAdapter {
	
	  @Bean 
	  public InternalResourceViewResolver resolver() {
	  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	  resolver.setViewClass(JstlView.class); resolver.setPrefix("/WEB-INF/views/");
	  resolver.setSuffix(".jsp");
	  resolver.setOrder(2);
	  return resolver; }
	  
	  
	  @Bean
	  public CommonsMultipartResolver multipartResolver() {
	      CommonsMultipartResolver resolver=new CommonsMultipartResolver();
	      resolver.setDefaultEncoding("utf-8");
	      resolver.setMaxUploadSize(1000000);
	      return resolver;
	  }
	 
	   @Bean
   public MessageSource messageSource() {
      ResourceBundleMessageSource source = new ResourceBundleMessageSource();
      source.setBasename("messages");
      return source;
   }

   @Override
   public Validator getValidator() {
      LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
      validator.setValidationMessageSource(messageSource());
      return validator;
   }
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {

	   // Register resource handler for CSS and JS
	      registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/")
	            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());

	      // Register resource handler for images
	      registry.addResourceHandler("/images/**").addResourceLocations("classpath:/statics/")
	            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	      
	      
   }
   


}
