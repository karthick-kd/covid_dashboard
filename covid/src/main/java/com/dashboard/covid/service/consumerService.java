package com.dashboard.covid.service;

import java.io.IOException;
import java.util.ArrayList;
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

import com.dashboard.covid.entity.CasesTimeSeries;
import com.dashboard.covid.entity.CasesTimeSeriesList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class consumerService {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/nationalWiseDetails")
	public List<CasesTimeSeries> getNationWiseDetails() throws JsonParseException, JsonMappingException, IOException
	{	

		String values;		
		values=  restTemplate.getForObject("https://api.covid19india.org/data.json", String.class);
		ObjectMapper mapper=new ObjectMapper();
		List<CasesTimeSeries> casesList=mapper.readValue(values,new TypeReference<List<CasesTimeSeries>>() {});
		
       		
		return casesList;
		
		
		
		
	}	
		
}





