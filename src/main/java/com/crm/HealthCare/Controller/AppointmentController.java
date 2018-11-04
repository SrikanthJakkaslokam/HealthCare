package com.crm.HealthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.HealthCare.entity.Appointment;
import com.crm.HealthCare.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService; 
    @RequestMapping("saveAppointment")
	public void saveAppointment(@RequestBody Appointment App) {
		appointmentService.saveAppointment(App); 
	}
}

