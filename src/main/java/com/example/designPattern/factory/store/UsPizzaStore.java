package com.example.designPattern.factory.store;

import com.example.designPattern.factory.pizza.region.us.UsStyleCheesePizza;
import com.example.designPattern.factory.pizza.Pizza;
import com.example.designPattern.factory.pizza.region.us.UsStyleVegiePizza;

public class UsPizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese" :
                pizza = new UsStyleCheesePizza();
                break;
            case "vegie" :
                pizza = new UsStyleVegiePizza();
                break;
        }
        return pizza;
    }
}
