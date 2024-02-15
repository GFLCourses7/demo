package com.example.demo.model;

public class Car {
    private String type;
    private String color;
    private Integer engine;

    public Car(String type, String color, Integer engine) {
        this.type = type;
        this.color = color;
        this.engine = engine;
    }

    public Car() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getType() != null ? !getType().equals(car.getType()) : car.getType() != null) return false;
        if (getColor() != null ? !getColor().equals(car.getColor()) : car.getColor() != null) return false;
        return getEngine() != null ? getEngine().equals(car.getEngine()) : car.getEngine() == null;
    }

    @Override
    public int hashCode() {
        int result = getType() != null ? getType().hashCode() : 0;
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getEngine() != null ? getEngine().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
