package com.example.designPattern.strategyPattern.ducks;

import com.example.designPattern.strategyPattern.fly.FlyNoWay;
import com.example.designPattern.strategyPattern.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck () {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("모형오리");
    }
}
