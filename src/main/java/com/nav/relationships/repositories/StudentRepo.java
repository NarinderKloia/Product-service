package com.nav.relationships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nav.relationships.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{
    
}
