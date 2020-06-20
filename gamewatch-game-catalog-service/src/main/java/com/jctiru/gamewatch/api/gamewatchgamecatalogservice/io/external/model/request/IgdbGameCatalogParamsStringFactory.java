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

		List<String> fields = new ArrayList<>();
		fields.add("name");
		fields.add("cover.url");
		fields.add("cover.url");
		fields.add("first_release_date");
		fields.add("genres.name");
		fields.add("slug");

		List<String> conditions = new ArrayList<>();
		conditions.add(
				"first_release_date > " + Instant.now().atZone(ZoneId.systemDefault()).minusMonths(6).toEpochSecond());
		conditions.add("first_release_date < " + Long.toString(Instant.now().getEpochSecond()));
		conditions.add("pulse_count > 1");

		params.setFields(fields);
		params.setConditions(conditions);
		params.setSort("pulse_count desc");
		params.setLimit(20);

		return params.getParamsString();
	}

	public String getMostAnticipatedIgdbParamsString() {
		IgdbGameCatalogParams params = new IgdbGameCatalogParams();

		List<String> fields = new ArrayList<>();
		fields.add("name");
		fields.add("cover.url");
		fields.add("cover.url");
		fields.add("first_release_date");
		fields.add("genres.name");
		fields.add("slug");

		List<String> conditions = new ArrayList<>();
		conditions.add("first_release_date > " + Long.toString(Instant.now().getEpochSecond()));
		conditions.add("pulse_count > 1");

		params.setFields(fields);
		params.setConditions(conditions);
		params.setSort("pulse_count desc");
		params.setLimit(20);

		return params.getParamsString();
	}

	public String getRecentlyReleasedIgdbParamsString() {
		IgdbGameCatalogParams params = new IgdbGameCatalogParams();

		List<String> fields = new ArrayList<>();
		fields.add("name");
		fields.add("cover.url");
		fields.add("cover.url");
		fields.add("first_release_date");
		fields.add("genres.name");
		fields.add("slug");

		List<String> conditions = new ArrayList<>();
		conditions.add(
				"first_release_date > " + Instant.now().atZone(ZoneId.systemDefault()).minusMonths(1).toEpochSecond());
		conditions.add("first_release_date < " + Long.toString(Instant.now().getEpochSecond()));

		params.setFields(fields);
		params.setConditions(conditions);
		params.setSort("first_release_date desc");
		params.setLimit(20);

		return params.getParamsString();
	}

}
