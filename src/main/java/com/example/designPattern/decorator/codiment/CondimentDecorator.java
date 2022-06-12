package com.example.designPattern.decorator.codiment;

import com.example.designPattern.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
