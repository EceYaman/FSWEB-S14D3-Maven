package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Ford engine is starting";
    }

    @Override
    public String accelerate() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Ford is accelerating";
    }

    @Override
    public String brake() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Ford is braking";
    }
}
