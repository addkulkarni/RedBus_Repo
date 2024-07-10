package com.chintamani.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chintamani.app.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>
{
	
}
