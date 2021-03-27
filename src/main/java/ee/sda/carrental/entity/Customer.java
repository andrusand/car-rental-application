package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Customer {

    @ManyToOne
    @JoinColumn(name = "roleID")
    private UserRole userRole;

    @GeneratedValue
    @Id
    Integer customerID;
    String customer_firstname;
    String customer_lastname;
    String customer_email;
    String customer_address;
    String customer_drivers_licence;
    String customer_password;

}
