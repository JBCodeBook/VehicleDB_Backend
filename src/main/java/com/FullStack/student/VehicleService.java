package com.FullStack.student;

import com.FullStack.student.model.Vehicle;

import java.util.List;

public interface VehicleService {

	public Vehicle saveVehicle(Vehicle vehicle);
	public void deleteVehicle(Vehicle vehicle);
	public List<Vehicle> getallVehicles();
}
