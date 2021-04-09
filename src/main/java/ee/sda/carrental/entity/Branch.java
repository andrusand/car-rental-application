package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Branch {

    @GeneratedValue
    @Id
    Integer branchID;

    @ManyToOne
    @JoinColumn(name = "employeeID")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "companyID")
    private Company company;


    String city;
}
