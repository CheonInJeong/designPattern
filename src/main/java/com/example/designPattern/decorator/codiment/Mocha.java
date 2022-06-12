package com.example.designPattern.decorator.codiment;

import com.example.designPattern.decorator.coffee.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.setSize(beverage.getSize());
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {

        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost += .10;
                break;
            case GRANDE:
                cost += .60;
                break;
            case VENTI:
                cost += 1.1;
                break;
            default:
                cost += .10;
        }

        return cost;
    }
}
