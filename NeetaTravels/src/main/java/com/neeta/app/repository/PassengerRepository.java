package com.neeta.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neeta.app.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>
{
	
}
