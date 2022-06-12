package com.example.designPattern.decorator;

import com.example.designPattern.decorator.codiment.Mocha;
import com.example.designPattern.decorator.codiment.Whip;
import com.example.designPattern.decorator.coffee.Beverage;
import com.example.designPattern.decorator.coffee.DarkRoast;
import com.example.designPattern.decorator.coffee.Espresso;

public class StarbuzzCoffee {
    public static void main(String args[]) {

        Beverage customBeverage = new DarkRoast();
        customBeverage.setSize(Beverage.Size.VENTI);
        customBeverage = new Mocha(customBeverage);
        customBeverage = new Mocha(customBeverage);
        customBeverage = new Whip(customBeverage);
        System.out.println("음료 : " + customBeverage.getDescription()+ " 사이즈 : " + customBeverage.getSize() + " 가격: $" + customBeverage.cost());

        Beverage customBeverage2 = new DarkRoast();
        customBeverage2.setSize(Beverage.Size.GRANDE);
        customBeverage2 = new Mocha(customBeverage2);
        customBeverage2 = new Mocha(customBeverage2);
        customBeverage2 = new Whip(customBeverage2);
        System.out.println("음료 : " + customBeverage2.getDescription()+ " 사이즈 : " + customBeverage2.getSize() + "가격 : $" +customBeverage2.cost());
    }
}
