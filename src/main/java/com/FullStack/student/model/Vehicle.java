package com.FullStack.student.model;

import javax.persistence.*;

@Entity
@Table(name="vehicles")
public class Vehicle {

	@Id
	private int cfr;
	private String type;
//	private int id;


	public Vehicle() {
	}

	public int getCfr() {
		return cfr;
	}

	public void setcfr(int cfr) {
		this.cfr = cfr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
