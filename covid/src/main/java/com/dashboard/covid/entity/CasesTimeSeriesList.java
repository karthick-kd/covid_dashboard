package com.dashboard.covid.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CasesTimeSeriesList {
	
	public List<CasesTimeSeries> getCasesList() {
		return casesList;
	}

	public void setCasesList(List<CasesTimeSeries> casesList) {
		this.casesList = casesList;
	}

	private List<CasesTimeSeries> casesList=new ArrayList<CasesTimeSeries>();

}
