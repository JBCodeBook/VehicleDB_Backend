package com.FullStack.student.controller;

import com.FullStack.student.VehicleService;
import com.FullStack.student.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
@CrossOrigin
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;

	@PostMapping("/add")
	public String add(@RequestBody Vehicle vehicle) {
		vehicleService.saveVehicle(vehicle);
		return "New vehicle added";
	}

	@PutMapping("/add")
	public String update(@RequestBody Vehicle vehicle) {
		vehicleService.saveVehicle(vehicle);
		return "New vehicle added";
	}

	@GetMapping("/getAll")
	public List<Vehicle> getallVehicles() {

		return vehicleService.getallVehicles();
	}

	@DeleteMapping("/delete")
	public String deleteVehicle(@RequestBody Vehicle vehicle) {

		System.out.print("\n\n\n\nDeleting " + vehicle.toString());
		vehicleService.deleteVehicle(vehicle);
		return "Vehicle deleted";
	}

	
}
