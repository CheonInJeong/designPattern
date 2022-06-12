package com.example.designPattern.factory;

import com.example.designPattern.factory.pizza.Pizza;
import com.example.designPattern.factory.store.KrPizzaStore;
import com.example.designPattern.factory.store.PizzaStore;

public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore store = new KrPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("주문 피자 : " + pizza.getName());
    }
}
