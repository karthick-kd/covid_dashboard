package com.dashboard.covid.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Getter
//@Setter
@JsonAutoDetect(fieldVisibility =JsonAutoDetect.Visibility.ANY)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Delta {

	private Long confirmed;
	private Long deceased;
	private Long recovered;
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
	
}
