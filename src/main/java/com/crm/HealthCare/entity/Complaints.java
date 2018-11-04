package com.crm.HealthCare.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="complaints")
public class Complaints {
    @Id
    @GeneratedValue
	private Integer cid;
	private String cname;
	private String description;
   
	@ManyToMany
	@JoinTable(
			name="complaint_disease",
			joinColumns= {@JoinColumn(name="cid")},
			inverseJoinColumns= {@JoinColumn(name="deid")}
	) 
	private List<Disease> disease;
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	@ManyToOne
	@JoinColumn(name="vid") 
	private Visiting visiting;
	public Visiting getVisiting() {
		return visiting;
	}
	public void setVisiting(Visiting visiting) {
		this.visiting = visiting;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
