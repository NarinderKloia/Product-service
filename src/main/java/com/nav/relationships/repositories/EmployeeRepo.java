package com.nav.relationships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nav.relationships.entity.Employees;

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Long> {

}
