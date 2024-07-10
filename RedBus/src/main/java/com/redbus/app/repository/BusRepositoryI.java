package com.redbus.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redbus.app.model.Bus;

@Repository
public interface BusRepositoryI extends JpaRepository<Bus, Integer>
{

}
