package jpabook.jpashop.item;

import jpabook.jpashop.Category;

import java.util.List;

public abstract class Item {

    Long id;
    String name;
    int price;
    int stockQuantity;
    List<Category> categories;

}
