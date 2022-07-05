package jpabook.jpashop.delivery;

import jpabook.jpashop.Address;
import jpabook.jpashop.order.Order;

public class Delivery {

    private Long id;
    private Order order;
    private Address address;
    private DeliveryStatus status;

}
