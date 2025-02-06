package com.etrack.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etrack.ems.entities.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

}
