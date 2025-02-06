package com.etrack.ems.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etrack.ems.entities.EmployeeModel;

@RestController
public class EmployeeController {

    @GetMapping("/api/employee")
    public String getEmployeeDetails() {
        return "Employee Details: ID - 12345, Name - John Doe, Department - Sales";
    }

    @GetMapping("/api/employee/:id")
    public String getEmployeebyId(@RequestParam Integer id) {
        return "Single Employee details have been fetched successfully";
    }

    @DeleteMapping("/api/employee/:id")
    public String deleteEmployeeById(@RequestParam Integer id) {
        return "Employee with ID " + id + " deleted successfully.";
    }

    @PutMapping("/api/employee/:id")
    public String UpdateEmployee(@RequestParam Integer id, @RequestBody String firstname, String lastname, String email, String phone, String position, String department, String salary, String dateofjoin, Boolean isactive, String address, String dob, String gender, String employementType, String emergencyContact) {
        return "The Employee has been updated successfully";
    }

    @PostMapping("/api/employee")
    public String CreateEmployee() {
        return "The Employee has been created successfully";
    }
}
