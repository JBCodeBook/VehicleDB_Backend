package com.FullStack.student.controller;

import com.FullStack.student.service.VehicleTypeService;
import com.FullStack.student.model.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/types")
@CrossOrigin
public class VehicleTypeController {

	@Autowired
	private VehicleTypeService vehicleTypeService;

	@GetMapping("/getAll")
	public List<VehicleType> getallVehicles() {

		return vehicleTypeService.getallVehicles();
	}




}
