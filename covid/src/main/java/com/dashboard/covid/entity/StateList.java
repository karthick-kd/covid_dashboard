package com.dashboard.covid.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility =JsonAutoDetect.Visibility.ANY)
public class StateList {

	private String state;
	private List<DistrictList> districtList;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<DistrictList> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<DistrictList> districtList) {
		this.districtList = districtList;
	}
	
}
