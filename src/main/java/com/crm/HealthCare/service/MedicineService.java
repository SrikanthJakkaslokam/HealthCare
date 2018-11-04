package com.crm.HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crm.HealthCare.DAO.MedicineDAO;
import com.crm.HealthCare.entity.Medicine;
@Service
public class MedicineService {
    @Autowired
	private MedicineDAO medicineDAO;
	
    public void saveService(@RequestBody Medicine med) {
    	medicineDAO.save(med);
    }
}
