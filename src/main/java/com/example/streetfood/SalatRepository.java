package com.example.streetfood;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalatRepository extends CrudRepository<Salat, Long> {

    public List<Salat> findAll();
	
}