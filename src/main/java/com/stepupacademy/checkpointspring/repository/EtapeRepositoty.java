package com.stepupacademy.checkpointspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stepupacademy.checkpointspring.entity.Etape;

@Repository
public interface EtapeRepositoty extends JpaRepository<Etape, Long> {

}


