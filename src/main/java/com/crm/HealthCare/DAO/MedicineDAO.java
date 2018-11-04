package com.crm.HealthCare.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.Medicine;
@Repository 
public interface MedicineDAO extends JpaRepository<Medicine	, Integer> {

}
