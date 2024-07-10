package com.redbus.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redbus.app.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>
{
	
}
