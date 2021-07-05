package com.crazyengg.umcvaxtracker.scheduler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.crazyengg.umcvaxtracker.pojo.Center;
import com.crazyengg.umcvaxtracker.service.TrackerService;

@Component
public class JobSchedular {
	
	@Autowired
	TrackerService trackerService;
	
	@Scheduled(cron = "0 * * * * ?")
	public void cronJobSch() {
		System.out.println("Job started" +  new Date());
		List<Center> centers = trackerService.getVaccinationCentersBasedOnPincode("400614");
		for (Center center : centers) {
			System.out.println(center);
		}
		
		System.out.println("Good Night");

	}

}
