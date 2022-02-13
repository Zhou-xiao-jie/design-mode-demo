package com.atxiaojie.designmode.builderpattern.test;

import com.atxiaojie.designmode.builderpattern.service.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Meal
 * @Description: 食物类
 * @author: zhouxiaojie
 * @date: 2021/11/28 9:59
 * @Version: V1.0.0
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
