package com.neeta.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Passenger
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String mobno;
	@ManyToOne (cascade = CascadeType.PERSIST)
	private Bus b;
}
