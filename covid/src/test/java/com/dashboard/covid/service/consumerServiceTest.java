package com.dashboard.covid.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.dashboard.covid.entity.CountryList;

public class consumerServiceTest {
	
	@Autowired
	RestTemplate restTemplate;
       

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @SuppressWarnings("unlikely-arg-type")
	@Test
    public void testGetCountryWiseDetails() {
    	   

    	try {
       	List<CountryList> countryListDetail=null;

    	ResponseEntity<CountryList[]> responseEntity=restTemplate.getForEntity("http://coronavirus-19-api.herokuapp.com/countries", CountryList[].class);
    	countryListDetail = Arrays.asList(responseEntity.getBody());
   	    Assert.assertEquals(true, countryListDetail.contains("country"));  

    	 }
    	 catch(Exception ex)    
    	 {
    		   ex.printStackTrace();
    	 }
   	     
       }
    
    @Test
    public void testGetCountryWiseDetailsException() {
    	   

    	try {
    		List<CountryList> countryListDetail=null;
        	ResponseEntity<CountryList[]> responseEntity=restTemplate.getForEntity("http://coronavirus-19-api.herokuapp.com/countries", CountryList[].class);
        	countryListDetail = Arrays.asList(responseEntity.getBody());
       	    Assert.assertEquals(false, countryListDetail.contains(""));  

    	 }
    	 catch(Exception ex)    
    	 {
    		   ex.printStackTrace();
    	 }
   	     
       }    
    
    
    
    
	@Test
    public void testGetCountryWiseDetailsIndia() {
    	   

    	try {
       	CountryList countryListDetail=null;

    	ResponseEntity<CountryList> responseEntity=restTemplate.getForEntity("http://coronavirus-19-api.herokuapp.com/countries/india", CountryList.class);
    	countryListDetail = responseEntity.getBody();
   	    Assert.assertEquals(true, countryListDetail.toString().contains("country"));

    	 }
    	 catch(Exception ex)    
    	 {
    		   ex.printStackTrace();
    	 }
   	     
       }
    
    @Test
    public void testGetCountryWiseDetailsIndiaException() {
    	   

    	try {
    		CountryList countryListDetail=null;
        	ResponseEntity<CountryList> responseEntity=restTemplate.getForEntity("http://coronavirus-19-api.herokuapp.com/countries/india", CountryList.class);
        	countryListDetail = responseEntity.getBody();
       	    Assert.assertEquals(false, countryListDetail.toString().contains("country"));

    	 }
    	 catch(Exception ex)    
    	 {
    		   ex.printStackTrace();
    	 }
   	     
       }
      
	    

}
