package com.sandbox.inheritance.vehicle;

public class Truck extends LandCraft {

    @Override
    public void transport() {
        System.out.println("Transporting truck stuff.");
    }

    @Override
    public void accellerate() {
        System.out.println("Truck is accelerating.");
    }

    public void horn()

    {

        System.out.println("Truck is honking.");

    }
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("engineStarted=").append(engineStarted).append('}');
        return sb.toString();
    }

}
