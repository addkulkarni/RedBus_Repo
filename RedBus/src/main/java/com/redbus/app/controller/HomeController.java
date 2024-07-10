package com.redbus.app.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.redbus.app.comparator.ComparatorClass;
import com.redbus.app.model.Bus;
import com.redbus.app.model.Passenger;
import com.redbus.app.servicei.BusServiceI;
import com.redbus.app.servicei.PassengerServiceI;

@RestController
public class HomeController
{
	@Autowired
	BusServiceI bsi;
	@Autowired
	RestTemplate restT;
	@Autowired
	PassengerServiceI psi;
	
	@GetMapping("/")
	public String homepage()
	{
		return "Redbus is UP";
	}
	
	@PostMapping("addbus")
	public String addNewBus(@RequestBody Bus b)
	{
		if(b.getBusName().equals("Neeta Travels"))
		{
			String url = "http://localhost:8083/addbus";
			restT.postForObject(url, b, String.class);
			return "Bus added to Neeta Travels";
		}
		
		else if(b.getBusName().equals("Chintamani Travels"))
		{
			String url = "http://localhost:8081/addbus";
			restT.postForObject(url, b, String.class);
			return "Bus added to Chintamani Travels";
		}
		
		else if(b.getBusName().equals("Purple Travels"))
		{
			String url = "http://localhost:8082/addbus";
			restT.postForObject(url, b, String.class);
			return "Bus added to Purple Travels";
		}
		else
		{
			return "Invalid bus agent name";
		}
		
	}
	
	@GetMapping("getbusbyfromtodate/{fromLoc}/{toLoc}/{date}")
	public List getBus(@PathVariable("fromLoc")String fromLoc, @PathVariable("toLoc")String toLoc, @PathVariable("date")String date)
	{
		List flist = new ArrayList<>();
		String url1 = "http://localhost:8081/getbusbyfromandtoanddate/"+fromLoc+"/"+toLoc+"/"+date+"";
		List l1 = restT.getForObject(url1, List.class);
		
		String url2 = "http://localhost:8082/getbusbyfromandtoanddate/"+fromLoc+"/"+toLoc+"/"+date+"";
		List l2 = restT.getForObject(url2, List.class);
		
		String url3 = "http://localhost:8083/getbusbyfromandtoanddate/"+fromLoc+"/"+toLoc+"/"+date+"";
		List l3 = restT.getForObject(url3, List.class);
		
		flist.addAll(l1);
		flist.addAll(l2);
		flist.addAll(l3);
		
		Collections.sort(flist, new ComparatorClass());
		
		return flist;
	}
	
	@PostMapping("/bookseat")
	public String booking(@RequestBody Passenger p)
	{
		
		if(p.getBusname().equals("Chintamani Travels"))
		{
			String url = "http://localhost:8081/bookseat";
			Bus b = restT.postForObject(url, p, Bus.class);
			
			bsi.savebus(b);
			psi.savePassenger(p);
			
			return "Booking successful";
		}
		else if(p.getBusname().equals("Purple Travels"))
		{
			String url = "http://localhost:8082/bookseat";
			Bus b = restT.postForObject(url, p, Bus.class);
			
			bsi.savebus(b);
			psi.savePassenger(p);
			
			return "Booking successful";
		}
		else if(p.getBusname().equals("Neeta Travels"))
		{
			String url = "http://localhost:8083/bookseat";
			Bus b = restT.postForObject(url, p, Bus.class);
			
			bsi.savebus(b);
			psi.savePassenger(p);
			bsi.deleteduplicate();		
	
			return "Booking successful";
		}
		else {
			return "Invalid Bus name";
		}
	}
}
