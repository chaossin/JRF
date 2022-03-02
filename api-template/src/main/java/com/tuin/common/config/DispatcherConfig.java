package com.tuin.common.config;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author jaeyong.pae
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.tuin" })
public class DispatcherConfig implements WebMvcConfigurer {

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.defaultContentType(MediaType.APPLICATION_JSON);
		WebMvcConfigurer.super.configureContentNegotiation(configurer);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		ObjectMapper objectMapper = new ObjectMapper();
		MappingJackson2HttpMessageConverter httpMessageConverter = new MappingJackson2HttpMessageConverter();
		httpMessageConverter.setObjectMapper(objectMapper);
		converters.add(httpMessageConverter);
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}	
	
//	@Override
//	public RequestMappingHandlerMapping requestMappingHandlerMapping(
//			ContentNegotiationManager contentNegotiationManager, FormattingConversionService conversionService,
//			ResourceUrlProvider resourceUrlProvider) {	
//		RequestMappingHandlerMapping requestMappingHandlerMapping = super.requestMappingHandlerMapping(contentNegotiationManager, conversionService, resourceUrlProvider);
//		requestMappingHandlerMapping.setAlwaysUseFullPath(false);
//		requestMappingHandlerMapping.setOrder(1);
//		return requestMappingHandlerMapping;
//	}
}