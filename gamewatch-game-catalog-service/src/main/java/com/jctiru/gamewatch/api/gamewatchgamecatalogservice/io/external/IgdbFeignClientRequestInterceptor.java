package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.AppPropertiesFile;
import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response.TwitchToken;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class IgdbFeignClientRequestInterceptor implements RequestInterceptor {

	@Autowired
	private TwitchServiceClient twitchServiceClient;

	@Autowired
	private AppPropertiesFile appPropertiesFile;

	private TwitchToken twitchToken;
	private long twitchTokenExpiration;

	@Override
	public void apply(RequestTemplate template) {
		if (twitchToken == null || twitchTokenExpiration - Instant.now().getEpochSecond() < 86400) {
			twitchToken = twitchServiceClient.getTwitchToken();
			twitchTokenExpiration = Instant.now().getEpochSecond() + twitchToken.getExpires_in();
		}

		template.header("Authorization", "Bearer " + twitchToken.getAccess_token());
		template.header("Client-ID", appPropertiesFile.getTwitchClientId());

	}

}
