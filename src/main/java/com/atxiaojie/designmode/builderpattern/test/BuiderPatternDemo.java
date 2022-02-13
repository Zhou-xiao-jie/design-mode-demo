package com.atxiaojie.designmode.builderpattern.test;

/**
 * @ClassName: BuiderPatternDemo
 * @Description: BuiderPatternDemo 使用 MealBuilder 来演示建造者模式（Builder Pattern）
 * @author: zhouxiaojie
 * @date: 2021/11/28 10:03
 * @Version: V1.0.0
 */
public class BuiderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
