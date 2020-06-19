package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response;

import java.util.List;

public class GameOverview {

	private long id;
	private Cover cover;
	private long first_release_date;
	private List<Genre> genres;
	private String name;
	private String slug;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	public long getFirst_release_date() {
		return first_release_date;
	}

	public void setFirst_release_date(long first_release_date) {
		this.first_release_date = first_release_date;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
