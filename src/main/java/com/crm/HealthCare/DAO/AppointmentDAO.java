package com.crm.HealthCare.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.Appointment;

@Repository
public interface AppointmentDAO extends JpaRepository<Appointment, Integer> {

}
