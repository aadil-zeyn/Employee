package com.UST.Employee.repositoory;

import com.UST.Employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {



    EmployeeEntity findByEmpId(String id);

    void deleteByEmpId(String id);
}
