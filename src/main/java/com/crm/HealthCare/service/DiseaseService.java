package com.crm.HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crm.HealthCare.DAO.DiseaseDAO;
import com.crm.HealthCare.entity.Disease;

@Service
public class DiseaseService {

	@Autowired
	private DiseaseDAO ddao;
	
	public void saveDisease(@RequestBody Disease ds) {
		ddao.save(ds);
	}
	
}
