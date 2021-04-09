package ee.sda.carrental.service;

import ee.sda.carrental.entity.Branch;
import ee.sda.carrental.entity.Company;
import ee.sda.carrental.repository.BranchRepository;
import ee.sda.carrental.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class BranchService implements GenericService<Branch>  {

        @Autowired
        BranchRepository repository;

        @Override
        public List<Branch> findAll() {
            return repository.findAll();
        }

        @Override
        public Branch read(Integer id) {
            return repository.findById(id).orElseThrow(null);
        }

        @Override
        public void createOrUpdate(Branch object) {
            repository.save(object);
        }

        @Override
        public void delete(Branch object) {
            repository.delete(object);
        }

        @Override
        public void delete(Integer id) {
            repository.deleteById(id);
        }
    }

