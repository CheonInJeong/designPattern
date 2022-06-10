package com.example.designPattern.strategyPattern.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly✈️");
    }
}
