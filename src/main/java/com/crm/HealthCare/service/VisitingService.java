package com.crm.HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.HealthCare.DAO.VisitingDAO;
import com.crm.HealthCare.entity.Visiting;

@Service
public class VisitingService {

	@Autowired
	private VisitingDAO visitingDao;
    
	public void saveVisiting(Visiting visiting) {
		visitingDao.save(visiting);
	}
}
