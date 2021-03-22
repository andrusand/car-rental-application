package ee.sda.carrental.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserRole {

    @GeneratedValue
    @Id
    Long id;
    String name;
}
