package com.example.streetfood;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HamburgerRepository extends CrudRepository<Hamburger, Long> {

    public List<Hamburger> findAll();
	
}