package com.dashboard.covid.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility =JsonAutoDetect.Visibility.ANY)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class StateList {

	private String state;
	private List<DistrictList> districtData;
	                           
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<DistrictList> getDistrictData() {
		return districtData;
	}
	public void setDistrictData(List<DistrictList> districtData) {
		this.districtData = districtData;
	}
	
	
}
