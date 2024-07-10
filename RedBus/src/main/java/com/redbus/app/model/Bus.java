package com.redbus.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(BusId.class)
public class Bus
{
	@Id
	private int busid;
	@Id
	private String busName;
	private String fromLoc;
	private String toLoc;
	private String date;
	private String time;
	private int price;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingid;
}
