package ee.sda.carrental.repository;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
