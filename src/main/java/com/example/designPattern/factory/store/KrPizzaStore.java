package com.example.designPattern.factory.store;

import com.example.designPattern.factory.pizza.region.korea.KrStyleCheesePizza;
import com.example.designPattern.factory.pizza.Pizza;
import com.example.designPattern.factory.pizza.region.korea.KrStyleVegiePizza;

public class KrPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese" :
                pizza = new KrStyleCheesePizza();
                break;
            case "vegie" :
                pizza = new KrStyleVegiePizza();
                break;
        }
        return pizza;
    }
}
