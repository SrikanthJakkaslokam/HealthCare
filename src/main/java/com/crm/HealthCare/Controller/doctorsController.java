package com.crm.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.entity.doctors;
import com.crm.HealthCare.service.doctorsService;
@RestController
public class doctorsController {

	@Autowired
	private doctorsService docser;
	@RequestMapping("saveDoctor")
	public void saveDoctor(@RequestBody doctors doc) {
		docser.saveDoctor(doc); 
	}
}
