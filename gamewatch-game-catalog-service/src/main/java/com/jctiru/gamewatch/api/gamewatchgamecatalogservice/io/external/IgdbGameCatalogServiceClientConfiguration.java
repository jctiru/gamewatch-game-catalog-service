package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external;

import org.springframework.context.annotation.Bean;

import feign.Logger;
import feign.RequestInterceptor;

public class IgdbGameCatalogServiceClientConfiguration {

	@Bean
	public RequestInterceptor requestInterceptor() {
		return new IgdbFeignClientRequestInterceptor();
	}

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}
