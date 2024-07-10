package com.redbus.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Bus
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingid;
	private int busid;
	private String busName;
	private String fromLoc;
	private String toLoc;
	private String date;
	private String time;
	private int price;
}
