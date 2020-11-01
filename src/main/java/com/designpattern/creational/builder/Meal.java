package com.designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/12 19:38
 * @Description:
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        return items.stream().mapToDouble(Item::price).sum();
    }

    public void showItems() {
        items.forEach(i -> {
            System.out.print("Item : " + i.name());
            System.out.print(", Packing : " + i.packing().pack());
            System.out.println(", Price : " + i.price());
        });
    }
}
