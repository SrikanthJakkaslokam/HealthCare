package com.crm.HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.HealthCare.DAO.doctorsDAO;
import com.crm.HealthCare.entity.doctors;

@Service
public class doctorsService {

	@Autowired
	private doctorsDAO docdao;

	public void saveDoctor(@RequestBody doctors doc) {
		docdao.save(doc);
	}
	
}
