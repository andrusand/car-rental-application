package ee.sda.carrental.service;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.entity.Reservation;
import ee.sda.carrental.repository.CarRepository;
import ee.sda.carrental.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ReservationService implements GenericService<Reservation> {

    @Autowired
    ReservationRepository repository;

    @Override
    public List<Reservation> findAll() {
        return repository.findAll();
    }

    @Override
    public Reservation read(Integer id) {
        return repository.findById(id).orElseThrow(null);
    }


    @Override
    public void createOrUpdate(Reservation object) {
        repository.save(object);
    }

    @Override
    public void delete(Reservation object) {
        repository.delete(object);

    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}

