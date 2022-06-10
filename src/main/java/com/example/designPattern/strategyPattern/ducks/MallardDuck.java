package com.example.designPattern.strategyPattern.ducks;

import com.example.designPattern.strategyPattern.fly.FlyWithWings;
import com.example.designPattern.strategyPattern.quack.MuteQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("🦆");
    }
}
