package com.crazyengg.umcvaxtracker.service;

import java.util.List;

import com.crazyengg.umcvaxtracker.pojo.Center;

public interface TrackerService {
	
	List<Center> getVaccinationCentersBasedOnPincode(String pincode);

}
