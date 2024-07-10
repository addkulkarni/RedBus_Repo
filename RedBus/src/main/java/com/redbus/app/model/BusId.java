package com.redbus.app.model;

import java.io.Serializable;
import java.util.Objects;


public class BusId implements Serializable
{
	private int busid;
	private String busName;
	
	@Override
	public int hashCode()
	{
		return Objects.hash(busName, busid);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusId other = (BusId) obj;
		return Objects.equals(busName, other.busName) && busid == other.busid;
	}
}
