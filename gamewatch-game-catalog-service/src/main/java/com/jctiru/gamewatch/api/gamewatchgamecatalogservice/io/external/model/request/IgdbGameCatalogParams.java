package com.jctiru.gamewatch.api.gamewatchgamecatalogservice.io.external.model.request;

import java.util.List;

public class IgdbGameCatalogParams {

	private List<String> fields;
	private List<String> conditions;
	private String sort;
	private Integer limit;

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<String> getConditions() {
		return conditions;
	}

	public void setConditions(List<String> conditions) {
		this.conditions = conditions;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getParamsString() {
		String fieldParamsString = "fields " + String.join(", ", this.fields) + ";";
		String conditionParamsString = "where " + String.join(" & ", this.conditions) + ";";
		String sortParamString = this.sort != null ? "sort " + this.sort + ";" : "";
		String limitParamString = this.limit != null ? "limit " + Integer.toString(this.limit) + ";" : "";

		return String.join(" ", fieldParamsString, conditionParamsString, sortParamString, limitParamString);
	}

}
