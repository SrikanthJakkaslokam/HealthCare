package com.crm.HealthCare.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="visiting")
public class Visiting {
    @Id
    @GeneratedValue
	private Integer vid;
	private Date vdate;
	private String hospitalName;

	@OneToOne
	@JoinColumn(name="apid")
	private Appointment appointment;
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	@ManyToOne
	@JoinColumn(name="did")
	private doctors doctor;
	public doctors getDoctor() {
		return doctor;
	}
	public void setDoctor(doctors doctor) {
		this.doctor = doctor;
	}
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public Date getVdate() {
		return vdate;
	}
	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	
	
}
