package com.neeta.app.servicei;

import java.util.List;

import com.neeta.app.model.Bus;

public interface BusServiceI
{

	void savebus(Bus b);

	List<Bus> getbusbyfromtodate(String fromLoc, String toLoc, String date);

	Bus getBusById(int bid);

}
