package com.example.designPattern.factory.pizza.region.korea;

import com.example.designPattern.factory.pizza.Pizza;

public class KrStyleVegiePizza extends Pizza {
    public KrStyleVegiePizza() {
        name = "한국 스타일 소스와 야채 피자";
        dough = "얇은 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("루꼴라");
    }

}
