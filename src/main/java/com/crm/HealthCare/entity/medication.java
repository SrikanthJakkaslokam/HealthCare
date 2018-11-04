package com.crm.HealthCare.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="medication")
public class medication {
    @Id
    @GeneratedValue
	private Integer mid;
	private String mname;
	private String mcompany;
	private Date expiryDate;

	@ManyToOne
	@JoinColumn(name="meid")
	private Medicine medicine;
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	@ManyToOne
	@JoinColumn(name="comid")  
	private Complaints complaints;
	
	public Complaints getComplaints() {
		return complaints;
	}
	public void setComplaints(Complaints complaints) {
		this.complaints = complaints;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMcompany() {
		return mcompany;
	}
	public void setMcompany(String mcompany) {
		this.mcompany = mcompany;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
