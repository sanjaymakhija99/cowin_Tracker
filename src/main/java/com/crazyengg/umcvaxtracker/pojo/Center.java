package com.crazyengg.umcvaxtracker.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Center {
	// public int center_id;
	public String name;
	public String address;
	// public String state_name;
	// public String district_name;
	// public String block_name;
	public int pincode;
	// public int lat;
	// public String from;
	// public String to;
	// public String fee_type;
	public List<Session> sessions;
}
