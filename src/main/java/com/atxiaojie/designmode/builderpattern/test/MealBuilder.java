package com.atxiaojie.designmode.builderpattern.test;

import com.atxiaojie.designmode.builderpattern.service.impl.ChickenBurger;
import com.atxiaojie.designmode.builderpattern.service.impl.Coke;
import com.atxiaojie.designmode.builderpattern.service.impl.Pepsi;
import com.atxiaojie.designmode.builderpattern.service.impl.VegBurger;

/**
 * @ClassName: MealBuilder
 * @Description: 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象
 * @author: zhouxiaojie
 * @date: 2021/11/28 10:01
 * @Version: V1.0.0
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
