package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.AppPropertiesFile;
import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.SpringApplicationContext;

import feign.Logger;
import feign.RequestInterceptor;

public class IgdbGameCatalogServiceClientConfiguration {

	@Bean
	public RequestInterceptor requestInterceptor() {
		AppPropertiesFile appPropertiesFile = SpringApplicationContext.getBean(AppPropertiesFile.class);

		return requestTemplate -> {
			requestTemplate.header("Accept", MediaType.TEXT_PLAIN_VALUE);
			requestTemplate.header("user-key", appPropertiesFile.getIgdbApiKey());
		};
	}

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}
