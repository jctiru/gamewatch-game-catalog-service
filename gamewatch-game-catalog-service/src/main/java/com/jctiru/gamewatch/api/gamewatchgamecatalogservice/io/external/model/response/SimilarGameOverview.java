package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response;

public class SimilarGameOverview {

	private long id;
	private Cover cover;
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
