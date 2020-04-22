package com.dashboard.covid.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dashboard.covid.entity.StateList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public StateList[] getStateWiseDetails() throws JsonParseException, JsonMappingException, IOException
	{
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);		
		
		String jsonStr= restTemplate.exchange("https://api.covid19india.org/v2/state_district_wise.json",HttpMethod.GET,entity,String.class).getBody();
		System.out.println(jsonStr);
		ObjectMapper mapper=new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		StateList[] jsonObj=mapper.readValue(jsonStr, StateList[].class);
		
		
		
		return jsonObj;
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
