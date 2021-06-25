package com.stepupacademy.checkpointspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stepupacademy.checkpointspring.entity.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {

}