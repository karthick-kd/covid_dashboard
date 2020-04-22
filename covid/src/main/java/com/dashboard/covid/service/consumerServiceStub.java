package com.dashboard.covid.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class consumerServiceStub {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/nationalWise")
	public String getNationWiseDetails()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);		
		
		return restTemplate.exchange("https://api.covid19india.org/data.json",HttpMethod.GET,entity,String.class).getBody();
		
	}
	
	
	@RequestMapping(value = "/stateWise")
	public String getStateWiseDetails()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);		
		
		return restTemplate.exchange("https://api.covid19india.org/state_district_wise.json",HttpMethod.GET,entity,String.class).getBody();
		
	}
	
	@RequestMapping(value = "/v2/stateWise")
	public String getStateWiseDetailsV2()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);		
		
		return restTemplate.exchange("https://api.covid19india.org/v2/state_district_wise.json",HttpMethod.GET,entity,String.class).getBody();
		
	}
	
	@RequestMapping(value = "/statesDailyChanges")
	public String getStatesDailyChanges()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);		
		
		return restTemplate.exchange("https://api.covid19india.org/states_daily.json",HttpMethod.GET,entity,String.class).getBody();
		
	}
	
	@RequestMapping(value = "/deathsRecoveries")
	public String getDeathsAndRecoveries()
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);		
		
		return restTemplate.exchange("https://api.covid19india.org/deaths_recoveries.json",HttpMethod.GET,entity,String.class).getBody();
		
	}
	
	
}
