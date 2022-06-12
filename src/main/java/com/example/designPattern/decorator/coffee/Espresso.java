package com.example.designPattern.decorator.coffee;


public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }
    public double cost () {
        double cost = 1.0;
        if (size!=null) {
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
            }
        }

        return cost;
    }
}
