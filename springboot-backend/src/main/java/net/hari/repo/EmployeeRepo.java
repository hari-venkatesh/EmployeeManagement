package net.hari.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.hari.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
