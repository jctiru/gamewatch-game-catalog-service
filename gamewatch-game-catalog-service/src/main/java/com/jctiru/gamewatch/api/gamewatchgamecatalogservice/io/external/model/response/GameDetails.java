package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response;

import java.util.List;

public class GameDetails {

	private long id;
	private String name;
	private String slug;
	private long first_release_date;
	private String summary;
	private String storyline;
	private Cover cover;
	private List<Genre> genres;
	private List<Theme> themes;
	private List<Screenshot> screenshots;
	private List<Artwork> artworks;
	private List<Video> videos;
	private List<Platform> platforms;
	private List<InvolvedCompany> involved_companies;
	private List<SimilarGameOverview> similar_games;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getFirst_release_date() {
		return first_release_date;
	}

	public void setFirst_release_date(long first_release_date) {
		this.first_release_date = first_release_date;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getStoryline() {
		return storyline;
	}

	public void setStoryline(String storyline) {
		this.storyline = storyline;
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

	public List<Screenshot> getScreenshots() {
		return screenshots;
	}

	public void setScreenshots(List<Screenshot> screenshots) {
		this.screenshots = screenshots;
	}

	public List<Artwork> getArtworks() {
		return artworks;
	}

	public void setArtworks(List<Artwork> artworks) {
		this.artworks = artworks;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public List<Platform> getPlatforms() {
		return platforms;
	}

	public void setPlatforms(List<Platform> platforms) {
		this.platforms = platforms;
	}

	public List<InvolvedCompany> getInvolved_companies() {
		return involved_companies;
	}

	public void setInvolved_companies(List<InvolvedCompany> involved_companies) {
		this.involved_companies = involved_companies;
	}

	public List<SimilarGameOverview> getSimilar_games() {
		return similar_games;
	}

	public void setSimilar_games(List<SimilarGameOverview> similar_games) {
		this.similar_games = similar_games;
	}

}
