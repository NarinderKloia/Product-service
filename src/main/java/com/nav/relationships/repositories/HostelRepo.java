package com.nav.relationships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nav.relationships.entity.Hostel;

@Repository
public interface HostelRepo extends JpaRepository<Hostel, Long> {

}
