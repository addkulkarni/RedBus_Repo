package com.chintamani.app.servicei;

import com.chintamani.app.controller.BusController;
import com.chintamani.app.model.Passenger;

public interface PassengerServiceI
{

	void savePassenger(Passenger p);

	Passenger getPasssengerById(int pid);

}
