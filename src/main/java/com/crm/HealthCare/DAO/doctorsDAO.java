package com.crm.HealthCare.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.doctors;
@Repository
public interface doctorsDAO extends JpaRepository<doctors, Integer> {

}
