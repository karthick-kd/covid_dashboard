package com.dashboard.covid.entity;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@JsonAutoDetect(fieldVisibility =JsonAutoDetect.Visibility.ANY)
public class CountryList {

	private String country;
	private Long cases;
	private Long todayCases;
	private Long deaths;
	private Long todayDeaths;
	private Long recovered;
	private Long active;
	private Long critical;	
	private Long casesPerOneMillion;
	private Long deathsPerOneMillion;
	private Long testsPerOneMillion;
	private Long totalTests;
		
	
}
