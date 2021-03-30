package za.co.anycompany.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import za.co.anycompany.datalayer.CustomerRepository;
import za.co.anycompany.model.Customer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void testLoadAllCustomers(){
        when(customerRepository.loadAllCustomers()).thenReturn(new ArrayList());
        List<Customer> customers = customerService.loadAllCustomers();
        assertEquals(0, customers.size());
        verify(customerRepository, times(1)).loadAllCustomers();
    }
}
