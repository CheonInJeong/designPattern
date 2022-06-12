package com.example.designPattern.decorator.coffee;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};
    String description = "제목없음";
    Size size;

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
