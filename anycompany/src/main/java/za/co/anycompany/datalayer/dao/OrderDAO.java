package za.co.anycompany.datalayer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.co.anycompany.model.Order;

import java.util.List;

@Repository
public interface OrderDAO extends JpaRepository<Order, Integer> {

    @Query("select * from Order o where o.customer.id =:customerId")
    List<Order> findAllOrdersForCustomer(@Param("customerId") int customerId);
}
