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

import com.dashboard.covid.entity.StateList;

public class consumerServiceV2Test {
	
	@Autowired
	RestTemplate restTemplate;
       

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @SuppressWarnings("unlikely-arg-type")
	@Test
    public void testGetStateWiseDetails() {
    	   

    	try {
       	List<StateList> stateListDetail=null;

    	ResponseEntity<StateList[]> responseEntity=restTemplate.getForEntity("https://api.covid19india.org/v2/state_district_wise.json", StateList[].class);
   		stateListDetail = Arrays.asList(responseEntity.getBody());
   	    Assert.assertEquals(true, stateListDetail.contains("districtData"));  

    	 }
    	 catch(Exception ex)    
    	 {
    		   ex.printStackTrace();
    	 }
   	     
       }
    
    @Test
    public void testGetStateWiseDetailsException() {
    	   

    	try {
       	List<StateList> stateListDetail=null;

    	ResponseEntity<StateList[]> responseEntity=restTemplate.getForEntity("https://api.covid19india.org/v2/state_district_wise.json", StateList[].class);
   		stateListDetail = Arrays.asList(responseEntity.getBody());
   	    Assert.assertEquals(false, stateListDetail.contains(""));  

    	 }
    	 catch(Exception ex)    
    	 {
    		   ex.printStackTrace();
    	 }
   	     
       }

      
	    

}
