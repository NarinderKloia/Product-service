package com.nav.relationships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nav.relationships.entity.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

}
