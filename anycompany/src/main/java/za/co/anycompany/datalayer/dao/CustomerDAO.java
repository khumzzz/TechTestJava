package za.co.anycompany.datalayer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.anycompany.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
}
