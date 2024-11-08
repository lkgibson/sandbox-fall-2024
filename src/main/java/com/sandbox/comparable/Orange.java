package com.sandbox.comparable;

public class Orange extends Fruit {


    public Orange(String type, String color, int size) {
        super(type, color, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orange {");
        sb.append("type='").append(type).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}