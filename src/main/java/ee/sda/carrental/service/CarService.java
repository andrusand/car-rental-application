package ee.sda.carrental.service;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.repository.CarRepository;
import ee.sda.carrental.util.CarDateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class CarService implements GenericService<Car> {

    final private CarRepository repository;


    @Override
    public List<Car> findAll() {
        return repository.findAll();
    }

    @Override
    public Car read(Integer id) {
        return repository.findById(id).orElseThrow(null);
    }


    @Override
    public void createOrUpdate(Car object) {
        repository.save(object);
    }

    @Override
    public void delete(Car object) {
        repository.delete(object);

    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}


