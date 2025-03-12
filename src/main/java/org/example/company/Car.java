package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car's engine is starting";
    }

    public String accelerate() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car is accelerating";
    }

    public String brake() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName);
        return "the car is braking";
    }
}
