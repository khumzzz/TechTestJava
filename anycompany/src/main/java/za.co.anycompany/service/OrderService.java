package za.co.anycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.anycompany.datalayer.CustomerRepository;
import za.co.anycompany.datalayer.OrderRepository;
import za.co.anycompany.model.Customer;
import za.co.anycompany.model.Order;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;

    public boolean placeOrder(Order order, int customerId)
    {
        Customer customer = customerRepository.load(customerId);

        if (order.getAmount() == 0 || customer == null)
            return false;
        order.setCustomer(customer);
        order.setVat(customer.getCountry() ==null ? 0 : customer.getCountry().getTax());
        orderRepository.save(order);

        return true;
    }

    public List<Order> findAllOrdersForCustomer(int customerId){
        return orderRepository.findAllOrdersForCustomer(customerId);
    }
}
