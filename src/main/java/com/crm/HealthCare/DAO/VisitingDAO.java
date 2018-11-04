package com.crm.HealthCare.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.HealthCare.entity.Visiting;
@Repository
public interface VisitingDAO extends JpaRepository<Visiting, Integer> {

}
