package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Reservation {

    @GeneratedValue
    @Id
    Integer reservationID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "companyID")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "carID")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "branchID")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "insuranceID")
    private Insurance insurance;

    String booking_date;
    String reservation_date_start;
    String reservation_date_end;
    String comments;
    Integer reservation_price;

}
