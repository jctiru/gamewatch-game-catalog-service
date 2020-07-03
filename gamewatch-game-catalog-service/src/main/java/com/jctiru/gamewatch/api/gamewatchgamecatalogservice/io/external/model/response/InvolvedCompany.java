package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.response;

public class InvolvedCompany {

	private long id;
	private Company company;
	private boolean developer;
	private boolean porting;
	private boolean publisher;
	private boolean supporting;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public boolean isDeveloper() {
		return developer;
	}

	public void setDeveloper(boolean developer) {
		this.developer = developer;
	}

	public boolean isPorting() {
		return porting;
	}

	public void setPorting(boolean porting) {
		this.porting = porting;
	}

	public boolean isPublisher() {
		return publisher;
	}

	public void setPublisher(boolean publisher) {
		this.publisher = publisher;
	}

	public boolean isSupporting() {
		return supporting;
	}

	public void setSupporting(boolean supporting) {
		this.supporting = supporting;
	}

}
