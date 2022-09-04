package com.cds.repo;

import com.cds.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    public Employee findByEmpMb(long empMb);
}
