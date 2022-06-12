package com.example.designPattern.decorator.coffee;

import com.example.designPattern.decorator.coffee.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드 커피";
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
