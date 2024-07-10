package com.chintamani.app.servicei;

import java.util.List;

import com.chintamani.app.controller.BusController;
import com.chintamani.app.model.Bus;

public interface BusServiceI
{

	void savebus(Bus b);

	List<Bus> getbusbyfromtodate(String fromLoc, String toLoc, String date);

	Bus getBusById(int busid);

	

}
