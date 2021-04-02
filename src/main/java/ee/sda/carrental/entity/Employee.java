package ee.sda.carrental.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
public class Employee implements UserDetails {

    @GeneratedValue
    @Id
    Integer employeeID;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "companyID")
    private Company company;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "branchID")
    private Branch branch;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "roleID")
    private UserRole userRole;

    String employee_firstname;
    String employee_lastname;
    String employee_email;
    String employee_password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
