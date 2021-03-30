package za.co.anycompany.datalayer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import za.co.anycompany.datalayer.dao.OrderDAO;
import za.co.anycompany.model.Order;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderRepositoryTest {
    @InjectMocks
    private OrderRepository orderRepository;
    @Mock
    private OrderDAO orderDAO;

    @Test
    public void testSave() {
        when(orderDAO.save(any(Order.class))).thenReturn(new Order());
        orderRepository.save(new Order());
        verify(orderDAO, times(1)).save(any(Order.class));
    }

}
