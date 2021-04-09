package ee.sda.carrental.repository;

import ee.sda.carrental.entity.Branch;
import ee.sda.carrental.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
