package com.example.designPattern.decorator.coffee;

public class Decaf extends Beverage{
    public Decaf () {
        description = "디카페인 커피";
    }

    @Override
    public double cost() {
        double cost;
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
