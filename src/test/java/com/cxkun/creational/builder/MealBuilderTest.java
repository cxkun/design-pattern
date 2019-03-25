package com.cxkun.creational.builder;

import com.cxkun.creational.builder.impl.Meal;
import com.cxkun.creational.builder.impl.MealBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MealBuilderTest {
    @Test
    public void test() {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.prepareVegMeal();
        Meal chickMeal = builder.prepareNonVegMeal();

        System.out.println(vegMeal.getCost());
        vegMeal.showItems();

        System.out.println(chickMeal.getCost());
        chickMeal.showItems();
    }
}