package com.crm.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.entity.Medicine;
import com.crm.HealthCare.service.MedicineService;
@RestController
public class MedicineController {

	@Autowired
	private MedicineService medser;
	@RequestMapping("saveService")
	public void saveService(@RequestBody Medicine med) {
		medser.saveService(med);
	}
}
