package za.co.anycompany.datalayer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import za.co.anycompany.datalayer.dao.CustomerDAO;
import za.co.anycompany.model.Customer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerRepositoryTest {
    @InjectMocks
    private CustomerRepository customerRepository;
    @Mock
    private CustomerDAO customerDAO;
    @Mock
    private CustomerDAO autowiredDAO;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLoadAllCustomers() {
        when(autowiredDAO.findAll()).thenReturn(new ArrayList());
        assertEquals(0, customerRepository.loadAllCustomers().size());
    }

    @Test
    public void testLoad() {
        Customer customer = new Customer();
        customer.setName("Test");
//        when(customerDAO.getOne(anyInt())).thenReturn(customer);
//        when(autowiredDAO.getOne(anyInt())).thenReturn(customer);
//        Customer customerLoaded = CustomerRepository.load(1);
//        assertNotNull(customerLoaded);
    }
}
