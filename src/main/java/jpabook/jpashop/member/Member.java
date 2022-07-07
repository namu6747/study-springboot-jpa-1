package jpabook.jpashop.member;

import jpabook.jpashop.Address;
import jpabook.jpashop.order.Order;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;
 //   private Address address;
  //  private List<Order> orders;

}
