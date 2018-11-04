package com.crm.HealthCare.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.DAO.PatientDAO;
import com.crm.HealthCare.entity.Patient;
import com.crm.HealthCare.service.PatientService;
@RestController
public class PatientController { 

	@Autowired
	private PatientService pser; 
	@RequestMapping("saveData")
	public void saveData(@RequestBody Patient p) {
	pser.saveData(p);
	}
	@RequestMapping("getPatientByMedicineName/{name}")  
	public List<Object[]> getPatientByMedicineName(@PathVariable String name){
    	return pser.getPatientByMedicineName(name);
    }
	@RequestMapping("getPatientsByDiseaseName/{name}")
	public List<String> getPatientsByDiseaseName(@PathVariable String name){
    	return pser.getPatientsByDiseaseName(name);
    }
	@RequestMapping("getPatientByDoctorName/{name}") 
	public List<String> getPatientByDoctorName(@PathVariable String name){
    	return pser.getPatientByDoctorName(name);
    }
	@RequestMapping("getDoctorBypatientName/{name}") 
	 public List<String> getDoctorBypatientName(@PathVariable String name){
	    	return pser.getDoctorBypatientName(name);
	}
	@RequestMapping("getAppointmentAndPatientByDate/{date}")
	public List<Object[]> getAppointmentAndPatientByDate(@PathVariable("date")@DateTimeFormat(pattern="yyyy-mm-dd") Date date){
    	return pser.getAppointmentAndPatientByDate(date);
    }
}
