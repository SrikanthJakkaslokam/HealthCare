package com.crm.HealthCare.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.Complaints;
@Repository
public interface ComplaintsDAO extends JpaRepository<Complaints, Integer> {

}
