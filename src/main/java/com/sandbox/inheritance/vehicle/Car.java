package com.sandbox.inheritance.vehicle;

public class Car extends LandCraft {

    @Override
    public void accellerate() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car {");
        sb.append("engineStarted=").append(engineStarted).append('}');  // Fluent API
        return sb.toString();
    }
}
