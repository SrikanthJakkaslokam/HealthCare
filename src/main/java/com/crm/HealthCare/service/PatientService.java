package com.crm.HealthCare.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.crm.HealthCare.DAO.PatientDAO;
import com.crm.HealthCare.entity.Patient;
@Service
public class PatientService {
    @Autowired
	private PatientDAO pdao;

    public void saveData(@RequestBody Patient p) {
    	pdao.save(p);  
    }
    
    public List<Object[]> getPatientByMedicineName(String name){
    	return pdao.getPatientByMedicineName(name);
    }
    
    public List<String> getPatientsByDiseaseName(String name){
    	return pdao.getPatientsByDiseaseName(name);
    }
    
    public List<String> getPatientByDoctorName(String name){
    	return pdao.getPatientByDoctorName(name);
    }
    public List<String> getDoctorBypatientName(String name){
    	return pdao.getDoctorBypatientName(name);
    }
    public List<Object[]> getAppointmentAndPatientByDate(Date date){
    	return pdao.getAppointmentAndPatientByDate(date);
    }
}
