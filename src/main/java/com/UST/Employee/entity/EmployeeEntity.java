package com.UST.Employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_table")
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private int id;
    private String empId;
    private String empname;
    private String empemail;
    private String designation;
    private String empHR;
}
