package com.example.designPattern.decorator.coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        double cost =1.0;
        switch (size) {
            case TALL:
                cost  = 1.0;
                break;
            case GRANDE:
                cost = 1.25;
                break;
            case VENTI:
                cost = 1.5;
                break;
            default:
                cost = 1.0;
        }
        return cost;
    }
}
