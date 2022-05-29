package com.FullStack.student.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="type")
public class VehicleType {

	@Id
	private String type;

	public VehicleType() {
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
