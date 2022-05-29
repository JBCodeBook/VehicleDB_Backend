package com.FullStack.student.service;

import com.FullStack.student.model.Vehicle;
import com.FullStack.student.model.VehicleType;

import java.util.List;

public interface VehicleTypeService {

	public VehicleType saveVehicle(VehicleType vehicle);
	public void deleteVehicle(VehicleType vehicle);
	public List<VehicleType> getallVehicles();
}
