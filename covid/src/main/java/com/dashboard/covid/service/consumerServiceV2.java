package com.dashboard.covid.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dashboard.covid.entity.StateList;


@RestController
public class consumerServiceV2 {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/stateWiseDetails")
	public List<StateList> getStateWiseDetails()
	{	
		
		List<StateList> stateListDetail=null;

		try {
			ResponseEntity<StateList[]> responseEntity=restTemplate.getForEntity("https://api.covid19india.org/v2/state_district_wise.json", StateList[].class);
			stateListDetail = Arrays.asList(responseEntity.getBody());
			
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
       		
		return stateListDetail;
		
		
		
		
	}	

	
	
}
		






