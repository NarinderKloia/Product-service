package com.nav.relationships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nav.relationships.entity.user;

public interface userRepo extends JpaRepository<user, Long> {

}
