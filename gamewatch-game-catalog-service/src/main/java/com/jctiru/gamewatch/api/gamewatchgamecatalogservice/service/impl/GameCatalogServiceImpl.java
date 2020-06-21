package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.IgdbGameCatalogServiceClient;
import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.request.IgdbGameCatalogParamsStringFactory;
import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response.GameOverview;
import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.service.GameCatalogService;

@Service
public class GameCatalogServiceImpl implements GameCatalogService {

	@Autowired
	private IgdbGameCatalogServiceClient igdbGameCatalogServiceClient;

	@Autowired
	private IgdbGameCatalogParamsStringFactory igdbGameCatalogParamsStringFactory;

	@Override
	public List<GameOverview> getPopularGamesNow() {
		return igdbGameCatalogServiceClient
				.getGamesList(igdbGameCatalogParamsStringFactory.getPopularGamesNowIgdbParamsString());
	}

	@Override
	public List<GameOverview> getMostAnticipated() {
		return igdbGameCatalogServiceClient
				.getGamesList(igdbGameCatalogParamsStringFactory.getMostAnticipatedIgdbParamsString());
	}

	@Override
	public List<GameOverview> getRecentlyReleased() {
		return igdbGameCatalogServiceClient
				.getGamesList(igdbGameCatalogParamsStringFactory.getRecentlyReleasedIgdbParamsString());
	}

	@Override
	public List<GameOverview> getComingSoon() {
		return igdbGameCatalogServiceClient
				.getGamesList(igdbGameCatalogParamsStringFactory.getComingSoonIgdbParamsString());
	}

}
