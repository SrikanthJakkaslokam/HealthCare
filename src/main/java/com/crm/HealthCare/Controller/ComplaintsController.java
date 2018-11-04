package com.crm.HealthCare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.entity.Complaints;
import com.crm.HealthCare.entity.medication;
import com.crm.HealthCare.service.ComplaintsService;

@RestController
public class ComplaintsController {

	@Autowired
	private ComplaintsService comser;

	@RequestMapping("saveComplaints")
	public void saveComplaints(@RequestBody Complaints com) {
		comser.saveComplaints(com);
	}
}
