package com.UST.Employee.controller;

import com.UST.Employee.entity.EmployeeEntity;
import com.UST.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addemp")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createEmployee(employeeEntity);
    }
    @GetMapping("/allemps")
    public List<EmployeeEntity> displayEmployees(){
        return employeeService.getEmployees();
    }
    @GetMapping("/{id}")
    public Object getEmployeeByEmpId(@PathVariable String empid){
        return employeeService.getEmployeeByEmpId(empid);

    }
    @Transactional
    @DeleteMapping("dltuser/{id}")
    public String deleteEmployee(@PathVariable String id){
        return employeeService.deleteEmployeeByEmpId(id);
    }
}
