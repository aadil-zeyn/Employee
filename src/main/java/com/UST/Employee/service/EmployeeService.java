package com.UST.Employee.service;

import com.UST.Employee.entity.EmployeeEntity;
import com.UST.Employee.repositoory.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return repo.sa
    }

    public List<EmployeeEntity> getEmployees() {
        return repo.findAll();
    }





    public EmployeeEntity getEmployeeByEmpId(String id) {
        return repo.findByEmpId(id);
    }



    public String deleteEmployeeByEmpId(String id) {
        repo.deleteByEmpId(id);
        return "the emploYee information is deleted";
    }
}
