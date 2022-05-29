package com.FullStack.student;

import com.FullStack.student.model.VehicleType;
import com.FullStack.student.repository.VehicleTypeRepository;
import com.FullStack.student.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleTypeServiceImpl implements VehicleTypeService {


	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;

	@Override
	public VehicleType saveVehicle(VehicleType vehicleType) {
		return vehicleTypeRepository.save(vehicleType);
	}

	@Override
	public void deleteVehicle(VehicleType vehicleType) {
		vehicleTypeRepository.delete(vehicleType);
	}

	@Override
	public List<VehicleType> getallVehicles() {
		return vehicleTypeRepository.findAll();
	}
}
