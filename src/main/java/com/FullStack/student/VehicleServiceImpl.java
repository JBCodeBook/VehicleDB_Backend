package com.FullStack.student;

import com.FullStack.student.model.Vehicle;
import com.FullStack.student.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {


	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public void deleteVehicle(Vehicle vehicle) {
		vehicleRepository.delete(vehicle);
	}

	@Override
	public List<Vehicle> getallVehicles() {
		return vehicleRepository.findAll();
	}
}
