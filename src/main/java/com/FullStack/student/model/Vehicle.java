package com.FullStack.student.model;

import javax.persistence.*;

@Entity
@Table(name="vehicles")
public class Vehicle {

	@Id
	private int cfr;
	private String type;
	private String insp_comp;
	private String insp_due;



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

	public String getInsp_comp() {
		return insp_comp;
	}

	public void setInsp_comp(String insp_comp) {
		this.insp_comp = insp_comp;
	}

	public String getInsp_due() {
		return insp_due;
	}

	public void setInsp_due(String insp_due) {
		this.insp_due = insp_due;
	}

}
