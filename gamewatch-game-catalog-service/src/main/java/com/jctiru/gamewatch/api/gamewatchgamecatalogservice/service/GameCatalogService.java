package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.service;

import java.util.List;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response.GameOverview;

public interface GameCatalogService {

	List<GameOverview> getPopularGamesNow();

}
