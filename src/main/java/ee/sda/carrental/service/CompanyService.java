package ee.sda.carrental.service;

import ee.sda.carrental.entity.Company;
import ee.sda.carrental.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements GenericService<Company>  {

    @Autowired
    CompanyRepository repository;

    @Override
    public List<Company> findAll() {
        return repository.findAll();
    }

    @Override
    public Company read(Integer id) {
        return repository.findById(id).orElseThrow(null);
    }

    @Override
    public void createOrUpdate(Company object) {
        repository.save(object);
    }

    @Override
    public void delete(Company object) {
        repository.delete(object);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
