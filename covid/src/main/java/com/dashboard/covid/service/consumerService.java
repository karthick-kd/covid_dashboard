package com.dashboard.covid.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dashboard.covid.entity.CountryList;


@RestController
public class consumerService {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/countryWiseDetails")
	public List<CountryList> getCountryWiseDetails()
	{	
		
		List<CountryList> countryWiseDetail=null;

		try {
			
			String uri="http://coronavirus-19-api.herokuapp.com/countries";
			ResponseEntity<CountryList[]> responseEntity=restTemplate.getForEntity(uri, CountryList[].class);
			countryWiseDetail = Arrays.asList(responseEntity.getBody());
			
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
       		
		return countryWiseDetail;
		
		
		
		
	}	

	
	@RequestMapping(value = "/countryWiseDetails/india")
	public CountryList getCountryWiseDetailsIndia()
	{	
		
		CountryList countryWiseDetail=null;

		try {
			
			String uri="http://coronavirus-19-api.herokuapp.com/countries/india";
			ResponseEntity<CountryList> responseEntity=restTemplate.getForEntity(uri, CountryList.class);
			countryWiseDetail = responseEntity.getBody();
			
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
       		
		return countryWiseDetail;
		
		
		
		
	}	


	
	
}
		






