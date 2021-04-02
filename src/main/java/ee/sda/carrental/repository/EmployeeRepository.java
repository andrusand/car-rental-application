package ee.sda.carrental.repository;

import ee.sda.carrental.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findByEmployeeID(String employeeID);

}
