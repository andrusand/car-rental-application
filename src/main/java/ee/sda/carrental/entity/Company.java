package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Company {

    @GeneratedValue
    @Id
    Integer companyID;

    String company_name;
    String internet_domain;
    String contact_address;
    String logo;

}
