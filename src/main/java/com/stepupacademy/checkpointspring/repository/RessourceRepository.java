package com.stepupacademy.checkpointspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stepupacademy.checkpointspring.entity.Ressource;

@Repository
public interface RessourceRepository extends JpaRepository<Ressource, Long> {

}