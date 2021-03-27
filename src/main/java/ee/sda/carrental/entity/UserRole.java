package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserRole {

    @GeneratedValue
    @Id
    Integer roleID;
    String role_type;

}
