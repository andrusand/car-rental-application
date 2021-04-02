package ee.sda.carrental.service;

import ee.sda.carrental.entity.Customer;
import ee.sda.carrental.entity.Employee;
import ee.sda.carrental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomerService implements UserDetailsService {

    @Autowired
    CustomerRepository repository;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Customer customer = repository.findByCustomerID(s);
        if (customer == null){
            throw new UsernameNotFoundException("Customer not found");
        }
        return customer;
    }

    public void createCustomer(Customer customer){
        repository.save(customer);

    }


}
