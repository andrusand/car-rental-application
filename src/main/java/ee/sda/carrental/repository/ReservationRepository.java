package ee.sda.carrental.repository;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {


}
