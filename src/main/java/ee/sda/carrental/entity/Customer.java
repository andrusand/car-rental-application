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
public class Customer implements UserDetails {

    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "roleID")
    private UserRole userRole;

    @GeneratedValue
    @Id
    Integer customerID;
    String customer_firstname;
    String customer_lastname;
    String customer_email;
    String customer_address;
    String customer_drivers_licence;
    String customer_password;

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
