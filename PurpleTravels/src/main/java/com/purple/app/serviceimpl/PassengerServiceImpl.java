package com.purple.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purple.app.model.Passenger;
import com.purple.app.repository.PassengerRepository;
import com.purple.app.servicei.PassengerServiceI;

@Service
public class PassengerServiceImpl implements PassengerServiceI
{
	@Autowired
	PassengerRepository pr;

	@Override
	public void savePassenger(Passenger p)
	{
		pr.save(p);
	}

	@Override
	public Passenger getPasssengerById(int pid)
	{
		return pr.findById(pid).get();
	}
	
}
