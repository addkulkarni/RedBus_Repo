package com.purple.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purple.app.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>
{
	
}
