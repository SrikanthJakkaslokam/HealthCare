package com.crm.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.entity.medication;
import com.crm.HealthCare.service.medicationService;

@RestController
public class medicationController {

	@Autowired
	private medicationService medicationService;
	
	@RequestMapping("savemedication")
	public void savemedication(medication med) {
		medicationService.savemedication(med);
	}
}
