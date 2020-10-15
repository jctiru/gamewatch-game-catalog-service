package com.jctiru.gamewatch.api.gamewatchgamecatalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppPropertiesFile {

	private Environment env;

	@Autowired
	public AppPropertiesFile(Environment env) {
		this.env = env;
	}

	public String getTwitchClientId() {
		return env.getProperty("twitch.client.id");
	}

	public String getTwitchClientSecret() {
		return env.getProperty("twitch.client.secret");
	}

}
