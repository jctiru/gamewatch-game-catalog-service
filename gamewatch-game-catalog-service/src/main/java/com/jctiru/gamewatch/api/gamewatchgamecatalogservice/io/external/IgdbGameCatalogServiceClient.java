package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response.GameDetails;
import com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response.GameOverview;

@FeignClient(name = "igdb-game-catalog-service", url = "https://api-v3.igdb.com/games")
public interface IgdbGameCatalogServiceClient {

	@PostMapping
	public List<GameOverview> getGamesList(@RequestBody String igdbParams);

	@PostMapping
	public List<GameDetails> getGameDetails(@RequestBody String igdbParams);

}
