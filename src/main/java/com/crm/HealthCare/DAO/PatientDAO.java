package com.crm.HealthCare.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.Patient;
@Repository
public interface PatientDAO extends JpaRepository<Patient, Integer>{


  @Query("select pa.pname,d.dname from medication m "
  		+ "join m.medicine med "
  		+ "join m.complaints com "
  		+ "join com.visiting v "
  		+ "join v.doctor d "
  		+ "join v.appointment ap "
  		+ "join ap.patient pa "
  		+ "where med.name=?1 ")
  public List<Object[]> getPatientByMedicineName(String name);
   
  @Query(" select p.pname from Complaints c "
  		+ "join c.disease d "
  		+ "join c.visiting v "
  		+ "join v.appointment app "
  		+ "join v.doctor doc "
  		+ "join app.patient p "
  		+ "where d.name=?1 ")
  public List<String> getPatientsByDiseaseName(String name);
  
  @Query("select p.pname from Visiting v "
  		+ "join v.doctor d "
  		+ "join v.appointment app "
  		+ "join app.patient p "
  		+ "where d.dname=?1")
 public List<String> getPatientByDoctorName(String name);
  
  @Query("select d.dname from Visiting v "
  		+ "join v.appointment app "
  		+ "join v.doctor d "
  		+ "join app.patient p "
  		+ "where p.pname=?1")
  public List<String> getDoctorBypatientName(String name);
  
  @Query("select p.pname from Appointment app "
  		+ "join app.patient p "
  		+ "where app.adate=?1")
 public List<Object[]> getAppointmentAndPatientByDate(Date date); 
}
