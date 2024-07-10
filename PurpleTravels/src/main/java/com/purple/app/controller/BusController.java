package com.purple.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purple.app.model.Passenger;
import com.purple.app.model.Bus;
import com.purple.app.servicei.BusServiceI;
import com.purple.app.servicei.PassengerServiceI;

@RestController
public class BusController
{
	@Autowired
	BusServiceI bsi;
	
	@Autowired
	PassengerServiceI psi;
	
	@GetMapping("/")
	public String homepage()
	{
		return "Purple is UP";
	}
	
	@PostMapping("addbus")
	public String addbus(@RequestBody Bus b)
	{
		bsi.savebus(b);
		return "Bus addedd successfully to Purple Travels";
	}
	
	@GetMapping("getbusbyfromandtoanddate/{fromLoc}/{toLoc}/{date}")
	public List<Bus> getbus(@PathVariable("fromLoc")String fromLoc, @PathVariable("toLoc")String toLoc, @PathVariable("date")String date)
	{
		List<Bus> l = bsi.getbusbyfromtodate(fromLoc, toLoc, date);
		return l;
	}
	
	@PostMapping("bookseat")
	public Bus booking(@RequestBody Passenger p)
	{
		psi.savePassenger(p);
		int bid = p.getB().getBusid();
		Bus b = bsi.getBusById(bid);
		return b;
	}
	
	@GetMapping("getpassenger/{pid}")
	public Passenger getpassenget(@PathVariable("pid")int pid)
	{
		Passenger p = psi.getPasssengerById(pid);
		return p;
	}
}
