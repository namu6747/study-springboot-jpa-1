package jpabook.jpashop.order;

import jpabook.jpashop.delivery.Delivery;
import jpabook.jpashop.item.Item;
import jpabook.jpashop.member.Member;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Order {

    private Long id;
    private Member member;
    private List<Item> orderItems;
    private Delivery delivery;
    private Date orderDate;
    private OrderStatus status;


}
