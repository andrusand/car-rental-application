package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Employee {

    @GeneratedValue
    @Id
    Integer employeeID;

    @ManyToOne
    @JoinColumn(name = "companyID")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "branchID")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "roleID")
    private UserRole userRole;

    String employee_firstname;
    String employee_lastname;
    String employee_email;
    String employee_password;

}
