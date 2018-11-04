package com.crm.HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.HealthCare.DAO.ComplaintsDAO;
import com.crm.HealthCare.entity.Complaints;

@Service
public class ComplaintsService {
    @Autowired
	private ComplaintsDAO complaintsDao;
    
    public void saveComplaints(Complaints com) {
    	complaintsDao.save(com);
    }
}
