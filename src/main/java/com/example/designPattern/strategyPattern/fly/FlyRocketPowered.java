package com.example.designPattern.strategyPattern.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓처럼 날아가요🚀");
    }
}
