package com.stepupacademy.checkpointspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stepupacademy.checkpointspring.entity.Pays;
import com.stepupacademy.checkpointspring.repository.PaysRepository;

@Service
public class PaysService {
    @Autowired
    private PaysRepository paysRepository;

    public List<Pays> findAll() {
        return paysRepository.findAll();
    }

    public Optional<Pays> findById(Long id)
    {
    	return paysRepository.findById(id);
    }

	public void save(Pays expenseList) {
		paysRepository.save(expenseList);		
	}
}
