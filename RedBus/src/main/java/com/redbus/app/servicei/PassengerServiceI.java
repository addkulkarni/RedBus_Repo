package com.redbus.app.servicei;

import com.redbus.app.model.Passenger;

public interface PassengerServiceI
{

	void savePassenger(Passenger p);

	Passenger getPasssengerById(int pid);

}
