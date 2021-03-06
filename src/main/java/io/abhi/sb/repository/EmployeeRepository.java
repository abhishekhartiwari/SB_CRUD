package io.abhi.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.abhi.sb.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
