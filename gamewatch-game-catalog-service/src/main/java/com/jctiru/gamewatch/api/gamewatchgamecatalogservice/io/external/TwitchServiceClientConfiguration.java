package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external;

import org.springframework.context.annotation.Bean;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.AppPropertiesFile;

import feign.Logger;
import feign.RequestInterceptor;

public class TwitchServiceClientConfiguration {

	@Bean
	public RequestInterceptor requestInterceptor(AppPropertiesFile appPropertiesFile) {
		return requestTemplate -> {
			requestTemplate.query("grant_type", "client_credentials");
			requestTemplate.query("client_id", appPropertiesFile.getTwitchClientId());
			requestTemplate.query("client_secret", appPropertiesFile.getTwitchClientSecret());
		};
	}

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}
