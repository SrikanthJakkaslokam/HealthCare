package com.crm.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.DAO.DiseaseDAO;
import com.crm.HealthCare.entity.Disease;
import com.crm.HealthCare.service.DiseaseService;

@RestController
public class DiseaseController {

	@Autowired
	private DiseaseService dss;
	@RequestMapping("saveDisease")
	public void saveDisease(@RequestBody Disease ds) {
	dss.saveDisease(ds); 
	
	}
}
