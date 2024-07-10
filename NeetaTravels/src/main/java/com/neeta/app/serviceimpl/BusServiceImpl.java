package com.neeta.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neeta.app.model.Bus;
import com.neeta.app.repository.BusRepositoryI;
import com.neeta.app.servicei.BusServiceI;

@Service
public class BusServiceImpl implements BusServiceI
{
	@Autowired
	BusRepositoryI br;

	@Override
	public void savebus(Bus b)
	{
		br.save(b);	
	}

	@Override
	public List<Bus> getbusbyfromtodate(String fromLoc, String toLoc, String date)
	{
		List<Bus> l = br.findAllByFromLocAndToLocAndDate(fromLoc, toLoc, date);
		return l;
	}

	@Override
	public Bus getBusById(int bid)
	{
		
		return br.findById(bid).get();
	}
}
