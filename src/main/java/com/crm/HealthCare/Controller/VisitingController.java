package com.crm.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.entity.Visiting;
import com.crm.HealthCare.service.VisitingService;

@RestController
public class VisitingController {

	@Autowired
	private VisitingService visitingService;
	@RequestMapping("saveVisiting")
	public void saveVisiting(@RequestBody Visiting visiting) {
		visitingService.saveVisiting(visiting); 
	}
	
}
