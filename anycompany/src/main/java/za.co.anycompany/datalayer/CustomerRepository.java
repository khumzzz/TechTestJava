package za.co.anycompany.datalayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.anycompany.datalayer.dao.CustomerDAO;
import za.co.anycompany.model.Customer;

import java.util.List;

@Service
public class CustomerRepository {

    private static CustomerDAO customerDAO;

    private CustomerDAO autowiredDAO;

    @Autowired
    private CustomerRepository(CustomerDAO customerDAO, CustomerDAO autowiredDAO) {
        CustomerRepository.customerDAO = customerDAO;
        this.autowiredDAO = autowiredDAO;
    }

    public static Customer load(int customerId) {
        return customerDAO.getOne(customerId);
    }

    public List<Customer> loadAllCustomers(){
        return autowiredDAO.findAll();
    }
}
