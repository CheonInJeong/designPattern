package com.example.designPattern.decorator.codiment;

import com.example.designPattern.decorator.coffee.Beverage;

public class Soy extends CondimentDecorator{

    public Soy (Beverage beverage){
        this.beverage = beverage;
        this.setSize(beverage.getSize());
    }

    public String getDescription () {
        return beverage.getDescription() + ", 두유";
    }
    @Override
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
