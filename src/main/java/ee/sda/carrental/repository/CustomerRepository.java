package ee.sda.carrental.repository;

import ee.sda.carrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public Customer findByCustomerID(String customerID);



}
