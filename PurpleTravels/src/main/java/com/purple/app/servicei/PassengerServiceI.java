package com.purple.app.servicei;

import com.purple.app.model.Passenger;

public interface PassengerServiceI
{

	void savePassenger(Passenger p);

	Passenger getPasssengerById(int pid);

}
