package com.crm.HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crm.HealthCare.DAO.AppointmentDAO;
import com.crm.HealthCare.entity.Appointment;

@Service
public class AppointmentService {
    @Autowired
	public AppointmentDAO appointmentDAO;
   
    public void saveAppointment( Appointment app) {
    appointmentDAO.save(app);
    }
}
