package com.testProject.CoronaTracker.CoronaTracekrApp.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Global", "Countries", "Date" })
public class CoronaDataModel {

	@JsonProperty("Global")
	private Global global;
	@JsonProperty("Countries")
	private List<Countries> countries = null;
	@JsonProperty("Date")
	private String date;
	@Override
	public String toString() {
		return "CoronaDataModel [global=" + global + ", countries=" + countries + ", date=" + date
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Global")
	public Global getGlobal() {
		return global;
	}

	@JsonProperty("Global")
	public void setGlobal(Global global) {
		this.global = global;
	}

	@JsonProperty("Countries")
	public List<Countries> getCountries() {
		return countries;
	}

	@JsonProperty("Countries")
	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

	@JsonProperty("Date")
	public String getDate() {
		return date;
	}

	@JsonProperty("Date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}