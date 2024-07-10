package com.redbus.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redbus.app.model.Bus;
import com.redbus.app.repository.BusRepositoryI;
import com.redbus.app.servicei.BusServiceI;

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
	public void deleteduplicate()
	{
		
		
	}
}
