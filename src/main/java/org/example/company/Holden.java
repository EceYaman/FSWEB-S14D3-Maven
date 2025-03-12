package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Holden engine is starting";
    }

    @Override
    public String accelerate() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Holden is accelerating";
    }

    @Override
    public String brake() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Holden is braking";
    }
}
