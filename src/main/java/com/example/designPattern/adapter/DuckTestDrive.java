package com.example.designPattern.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();

        System.out.println("오리가 말하길");
        duck.quack();

        System.out.println("어댑터가 말하길");
        turkeyAdapter.quack();


    }
}
