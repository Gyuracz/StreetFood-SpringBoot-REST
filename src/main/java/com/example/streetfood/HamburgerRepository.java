package com.example.streetfood;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HamburgerRepository extends JpaRepository<Hamburger, Long> {

    public List<Hamburger> findAll();
	
}