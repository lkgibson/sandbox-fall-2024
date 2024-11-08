package com.sandbox.comparable;

public class Apple extends Fruit implements Comparable<Fruit> {


    public Apple(String type, String color, int size) {
        super(type, color, size);
    }

    @Override
    public int compareTo(Fruit fruit) {

        int typeComparison = this.type.compareTo(fruit.getType());
        if (typeComparison != 0) {
            return typeComparison;
        }

        int colorComparison = this.color.compareTo(fruit.getColor());
        if (colorComparison != 0) {
            return colorComparison;
        }

        return Integer.compare(this.size, fruit.getSize());
    }
}