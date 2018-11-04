package com.crm.HealthCare.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.medication;
@Repository
public interface medicationDAO extends JpaRepository<medication, Integer> {

}
