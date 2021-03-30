package za.co.anycompany.datalayer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.anycompany.model.Country;
import za.co.anycompany.model.Customer;

@Repository
public interface CountryDAO extends JpaRepository<Country, Integer> {
}
