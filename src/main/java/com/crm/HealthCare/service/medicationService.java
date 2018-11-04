package com.crm.HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.HealthCare.entity.medication;

@Service
public class medicationService {

	@Autowired
	private medicationService medicationSer;
	
	public void savemedication(medication med) {
		medicationSer.savemedication(med); 
	}
}
