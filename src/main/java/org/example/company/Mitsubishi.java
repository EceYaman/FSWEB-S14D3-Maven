package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Mitsubishi engine is starting";
    }

    @Override
    public String accelerate() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the Mitsubishi is braking";
    }
}
