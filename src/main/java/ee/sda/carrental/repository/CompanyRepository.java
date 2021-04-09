package ee.sda.carrental.repository;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.entity.Company;
import ee.sda.carrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer>  {

}
