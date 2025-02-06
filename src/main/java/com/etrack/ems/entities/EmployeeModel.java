package com.etrack.ems.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OnetoMany;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "Employees")
@Data
public class EmployeeModel {

    // employee id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String position;

    private String salary;
    private String dateofjoin;
    private Boolean isactive;

    private String address;
    private String dob;
    private String gender;

    private String employementType;
    private String emergencyContact;

    @OnetoMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private DepartmentModel department;
}
