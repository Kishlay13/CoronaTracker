package com.testProject.CoronaTracker.CoronaTracekrApp.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Country", "CountryCode", "Slug", "NewConfirmed", "TotalConfirmed", "NewDeaths", "TotalDeaths",
		"NewRecovered", "TotalRecovered", "Date" })
public class Countries {

	@JsonProperty("Country")
	private String country;
	@JsonProperty("CountryCode")
	private String countryCode;
	@JsonProperty("Slug")
	private String slug;
	@JsonProperty("NewConfirmed")
	private Integer newConfirmed;
	@JsonProperty("TotalConfirmed")
	private Integer totalConfirmed;
	@JsonProperty("NewDeaths")
	private Integer newDeaths;
	@JsonProperty("TotalDeaths")
	private Integer totalDeaths;
	@Override
	public String toString() {
		return "Countries [country=" + country + ", countryCode=" + countryCode + ", slug=" + slug + ", newConfirmed="
				+ newConfirmed + ", totalConfirmed=" + totalConfirmed + ", newDeaths=" + newDeaths + ", totalDeaths="
				+ totalDeaths + ", newRecovered=" + newRecovered + ", totalRecovered=" + totalRecovered + ", date="
				+ date + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("NewRecovered")
	private Integer newRecovered;
	@JsonProperty("TotalRecovered")
	private Integer totalRecovered;
	@JsonProperty("Date")
	private String date;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("Country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("CountryCode")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("CountryCode")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@JsonProperty("Slug")
	public String getSlug() {
		return slug;
	}

	@JsonProperty("Slug")
	public void setSlug(String slug) {
		this.slug = slug;
	}

	@JsonProperty("NewConfirmed")
	public Integer getNewConfirmed() {
		return newConfirmed;
	}

	@JsonProperty("NewConfirmed")
	public void setNewConfirmed(Integer newConfirmed) {
		this.newConfirmed = newConfirmed;
	}

	@JsonProperty("TotalConfirmed")
	public Integer getTotalConfirmed() {
		return totalConfirmed;
	}

	@JsonProperty("TotalConfirmed")
	public void setTotalConfirmed(Integer totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	@JsonProperty("NewDeaths")
	public Integer getNewDeaths() {
		return newDeaths;
	}

	@JsonProperty("NewDeaths")
	public void setNewDeaths(Integer newDeaths) {
		this.newDeaths = newDeaths;
	}

	@JsonProperty("TotalDeaths")
	public Integer getTotalDeaths() {
		return totalDeaths;
	}

	@JsonProperty("TotalDeaths")
	public void setTotalDeaths(Integer totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	@JsonProperty("NewRecovered")
	public Integer getNewRecovered() {
		return newRecovered;
	}

	@JsonProperty("NewRecovered")
	public void setNewRecovered(Integer newRecovered) {
		this.newRecovered = newRecovered;
	}

	@JsonProperty("TotalRecovered")
	public Integer getTotalRecovered() {
		return totalRecovered;
	}

	@JsonProperty("TotalRecovered")
	public void setTotalRecovered(Integer totalRecovered) {
		this.totalRecovered = totalRecovered;
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
