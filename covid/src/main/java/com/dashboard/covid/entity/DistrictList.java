package com.dashboard.covid.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility =JsonAutoDetect.Visibility.ANY)
public class DistrictList {

	private String district;
	private Long active;
	private Long confirmed;
	private Long deceased;
	private Long recovered;
	private Delta delta;
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Long getActive() {
		return active;
	}
	public void setActive(Long active) {
		this.active = active;
	}
	public Long getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Long confirmed) {
		this.confirmed = confirmed;
	}
	public Long getDeceased() {
		return deceased;
	}
	public void setDeceased(Long deceased) {
		this.deceased = deceased;
	}
	public Long getRecovered() {
		return recovered;
	}
	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}
	public Delta getDelta() {
		return delta;
	}
	public void setDelta(Delta delta) {
		this.delta = delta;
	}
	
	
}
