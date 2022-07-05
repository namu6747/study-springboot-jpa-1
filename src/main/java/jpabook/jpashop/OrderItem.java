package jpabook.jpashop;

import jpabook.jpashop.item.Item;
import jpabook.jpashop.order.Order;

public class OrderItem {

    private Long id;
    private Item item;
    private Order order;
    private int orderPrice;
    private int count;

}
