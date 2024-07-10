package com.purple.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purple.app.model.Bus;

@Repository
public interface BusRepositoryI extends JpaRepository<Bus, Integer>
{

	List<Bus> findAllByFromLocAndToLocAndDate(String fromLoc, String toLoc, String date);

}