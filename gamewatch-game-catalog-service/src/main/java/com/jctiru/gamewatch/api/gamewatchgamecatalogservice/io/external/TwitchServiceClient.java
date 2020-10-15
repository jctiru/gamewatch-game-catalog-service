package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response.TwitchToken;

@FeignClient(name = "twitch-service", url = "https://id.twitch.tv/oauth2/token", configuration = TwitchServiceClientConfiguration.class)
public interface TwitchServiceClient {

	@PostMapping
	public TwitchToken getTwitchToken();

}
