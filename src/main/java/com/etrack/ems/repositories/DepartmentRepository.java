package com.etrack.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etrack.ems.entities.DepartmentModel;

public interface DepartmentRepository extends JpaRepository<DepartmentModel, Integer> {

}
