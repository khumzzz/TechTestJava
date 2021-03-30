package za.co.anycompany.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import za.co.anycompany.datalayer.CustomerRepository;
import za.co.anycompany.datalayer.OrderRepository;
import za.co.anycompany.model.Customer;
import za.co.anycompany.model.Order;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {
    @InjectMocks
    private OrderService orderService;

    @Mock
    private OrderRepository orderRepository;

    @Test
    public void testFindAllOrdersForCustomer(){
        when(orderRepository.findAllOrdersForCustomer(anyInt())).thenReturn(new ArrayList());
        List<Order> orders = orderService.findAllOrdersForCustomer(1);
        assertEquals(0, orders.size());
        verify(orderRepository, times(1)).findAllOrdersForCustomer(1);
    }
}
