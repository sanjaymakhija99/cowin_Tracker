package com.crazyengg.umcvaxtracker.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Session {

	//public String session_id;
	public String date;
	public int available_capacity;
	public int min_age_limit;
	public String vaccine;
	//public List<String> slots;

}
