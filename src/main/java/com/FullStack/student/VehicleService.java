package com.FullStack.student;

import com.FullStack.student.model.Vehicle;

import java.sql.Date;
import java.util.List;

public interface VehicleService {

	public Vehicle saveVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);
	public void deleteVehicle(Vehicle vehicle);
	public List<Vehicle> getallVehicles();
}
