package com.crm.HealthCare.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.Disease;
@Repository
public interface DiseaseDAO extends JpaRepository<Disease, Integer> {

}
