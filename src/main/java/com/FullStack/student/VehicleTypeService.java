package com.FullStack.student;

import com.FullStack.student.model.VehicleType;

import java.util.List;

public interface VehicleTypeService {

	public VehicleType saveVehicle(VehicleType vehicleType);
	public void deleteVehicle(VehicleType vehicleType);
	public List<VehicleType> getallVehicles();
}
