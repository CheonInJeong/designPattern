package com.example.designPattern.strategyPattern;

import com.example.designPattern.strategyPattern.ducks.Duck;
import com.example.designPattern.strategyPattern.ducks.MallardDuck;
import com.example.designPattern.strategyPattern.ducks.ModelDuck;
import com.example.designPattern.strategyPattern.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck miniDuck = new MallardDuck();
        miniDuck.performFly();
        miniDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
