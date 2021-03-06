package ee.sda.carrental.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Car {

    @GeneratedValue
    @Id
    Integer carID;


    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinColumn(name = "companyID")
    private Company company;


    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinColumn(name = "branchID")
    private Branch branch;

    String brand;
    String model;
    Integer year;
    String colour;
    Integer mileage;
    String rental_status;
    Integer price_per_day;
    String gearbox_type;
    String car_description;

}
