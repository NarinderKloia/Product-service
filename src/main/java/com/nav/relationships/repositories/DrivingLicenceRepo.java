package com.nav.relationships.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nav.relationships.entity.DrivingLicence;

@Repository
public interface DrivingLicenceRepo extends JpaRepository<DrivingLicence, Long> {
    Optional<DrivingLicence> findByUserId(Long userId);
}
