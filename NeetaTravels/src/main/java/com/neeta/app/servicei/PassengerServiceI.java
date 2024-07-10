package com.neeta.app.servicei;

import com.neeta.app.model.Passenger;

public interface PassengerServiceI
{

	void savePassenger(Passenger p);

	Passenger getPasssengerById(int pid);

}
