package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Payment {
    @GeneratedValue
    @Id
    Integer paymentID;

    @ManyToOne
    @JoinColumn(name = "reservationID")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "reservation_price")
    private Reservation reservationPrice;

    String payment_type;
    String payment_date;

}
