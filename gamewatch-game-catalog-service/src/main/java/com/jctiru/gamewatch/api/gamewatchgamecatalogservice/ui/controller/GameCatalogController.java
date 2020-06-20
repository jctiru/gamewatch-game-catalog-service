package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response.GameOverview;
import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.service.GameCatalogService;

@RestController
@RequestMapping("/game-catalog")
public class GameCatalogController {

	@Autowired
	private GameCatalogService gameCatalogService;

	@GetMapping("/popular-now")
	public List<GameOverview> getPopularGamesNow() {
		return gameCatalogService.getPopularGamesNow();
	}

	@GetMapping("/most-anticipated")
	public List<GameOverview> getMostAnticipated() {
		return gameCatalogService.getMostAnticipated();
	}

	@GetMapping("/recently-released")
	public List<GameOverview> getRecentlyReleased() {
		return gameCatalogService.getRecentlyReleased();
	}

}
