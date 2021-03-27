package ee.sda.carrental.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Insurance {

    @GeneratedValue
    @Id
    Integer insuranceID;

    String insurance_type;
    Integer insurance_price_per_day;

}
