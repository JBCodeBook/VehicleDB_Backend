package com.FullStack.student.repository;

import com.FullStack.student.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, java.lang.String> {
	VehicleType findByType(String type);
}
