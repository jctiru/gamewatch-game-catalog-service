package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.request;

import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class IgdbGameCatalogParamsStringFactory {

	public String getPopularGamesNowIgdbParamsString() {
		IgdbGameCatalogParams params = new IgdbGameCatalogParams();

		List<String> conditions = new ArrayList<>();
		conditions.add(
				"first_release_date > " + Instant.now().atZone(ZoneId.systemDefault()).minusMonths(6).toEpochSecond());
		conditions.add("first_release_date < " + Long.toString(Instant.now().getEpochSecond()));
		conditions.add("pulse_count > 1");

		params.setFields(IgdbGameCatalogParamsStringFactory.getGameOverviewFieldParams());
		params.setConditions(conditions);
		params.setSort("pulse_count desc");
		params.setLimit(20);

		return params.getParamsString();
	}

	public String getMostAnticipatedIgdbParamsString() {
		IgdbGameCatalogParams params = new IgdbGameCatalogParams();

		List<String> conditions = new ArrayList<>();
		conditions.add("first_release_date > " + Long.toString(Instant.now().getEpochSecond()));
		conditions.add("pulse_count > 1");

		params.setFields(IgdbGameCatalogParamsStringFactory.getGameOverviewFieldParams());
		params.setConditions(conditions);
		params.setSort("pulse_count desc");
		params.setLimit(20);

		return params.getParamsString();
	}

	public String getRecentlyReleasedIgdbParamsString() {
		IgdbGameCatalogParams params = new IgdbGameCatalogParams();

		List<String> conditions = new ArrayList<>();
		conditions.add(
				"first_release_date > " + Instant.now().atZone(ZoneId.systemDefault()).minusMonths(1).toEpochSecond());
		conditions.add("first_release_date < " + Long.toString(Instant.now().getEpochSecond()));

		params.setFields(IgdbGameCatalogParamsStringFactory.getGameOverviewFieldParams());
		params.setConditions(conditions);
		params.setSort("first_release_date desc");
		params.setLimit(20);

		return params.getParamsString();
	}

	public String getComingSoonIgdbParamsString() {
		IgdbGameCatalogParams params = new IgdbGameCatalogParams();

		List<String> conditions = new ArrayList<>();
		conditions.add("first_release_date > " + Long.toString(Instant.now().getEpochSecond()));

		params.setFields(IgdbGameCatalogParamsStringFactory.getGameOverviewFieldParams());
		params.setConditions(conditions);
		params.setSort("first_release_date asc");
		params.setLimit(20);

		return params.getParamsString();
	}

	private static List<String> getGameOverviewFieldParams() {
		List<String> fields = new ArrayList<>();
		fields.add("name");
		fields.add("cover.image_id");
		fields.add("cover.url");
		fields.add("first_release_date");
		fields.add("genres.name");
		fields.add("slug");

		return fields;
	}

	public String getGameDetailsIgdbParamsString(String gameSlug) {
		IgdbGameCatalogParams params = new IgdbGameCatalogParams();

		List<String> fields = new ArrayList<>();
		fields.add("name");
		fields.add("slug");
		fields.add("first_release_date");
		fields.add("summary");
		fields.add("storyline");
		fields.add("cover.image_id");
		fields.add("cover.url");
		fields.add("genres.name");
		fields.add("themes.name");
		fields.add("screenshots.image_id");
		fields.add("screenshots.url");
		fields.add("artworks.image_id");
		fields.add("artworks.url");
		fields.add("videos.name");
		fields.add("videos.video_id");
		fields.add("platforms.name");
		fields.add("involved_companies.company.name");
		fields.add("involved_companies.developer");
		fields.add("involved_companies.porting");
		fields.add("involved_companies.publisher");
		fields.add("involved_companies.supporting");
		fields.add("similar_games.cover.image_id");
		fields.add("similar_games.cover.url");
		fields.add("similar_games.name");
		fields.add("similar_games.slug");

		List<String> conditions = new ArrayList<>();
		conditions.add("slug = \"" + gameSlug + "\"");

		params.setFields(fields);
		params.setConditions(conditions);

		return params.getParamsString();
	}

}
