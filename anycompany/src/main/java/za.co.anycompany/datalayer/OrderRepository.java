package za.co.anycompany.datalayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.anycompany.datalayer.dao.OrderDAO;
import za.co.anycompany.model.Order;

import java.util.List;

@Service
public class OrderRepository {

    @Autowired
    private OrderDAO orderDAO;

    public void save(Order order) {
        orderDAO.save(order);
    }

    public List<Order> findAllOrdersForCustomer(int customerId) {
        return orderDAO.findAllOrdersForCustomer(customerId);
    }
}
