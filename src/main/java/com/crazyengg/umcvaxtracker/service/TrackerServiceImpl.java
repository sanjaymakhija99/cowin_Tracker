package com.crazyengg.umcvaxtracker.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.crazyengg.umcvaxtracker.constant.Constants;
import com.crazyengg.umcvaxtracker.pojo.Center;
import com.crazyengg.umcvaxtracker.pojo.VaxCenters;

@Service
public class TrackerServiceImpl implements TrackerService{
	
	
	@Autowired RestTemplate restTemplate;
	
	
	@Override
	public List<Center> getVaccinationCentersBasedOnPincode(String pincode) {
		
		HttpEntity<String> entity = setHeaders();
		
		String url = Constants.COWIN_URL+ pincode
				+ "&date=" + getCurrentDate();
		ResponseEntity<VaxCenters> response = restTemplate.exchange(url, HttpMethod.GET, entity, VaxCenters.class);
		return  response.getBody().centers;
	}
	
	

	private HttpEntity<String> setHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		return entity;
	}
	

	private String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		return formatter.format(date);
	}


}
