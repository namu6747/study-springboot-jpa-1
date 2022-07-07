package jpabook.jpashop;

import jpabook.jpashop.item.Item;

import java.util.List;

public class Category {

    private Long id;
    private String name;
    private List<Item> items;
    
    private Category parent;
    private List<Category> child;

}
