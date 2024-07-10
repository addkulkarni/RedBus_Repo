package com.chintamani.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chintamani.app.model.Bus;
import com.chintamani.app.repository.BusRepositoryI;
import com.chintamani.app.servicei.BusServiceI;

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
		List<Bus> l= br.findAllByFromLocAndToLocAndDate(fromLoc, toLoc, date);
		return l;
	}

	@Override
	public Bus getBusById(int busid)
	{
		return br.findById(busid).get();
	}
}
