package com.company;

public class Car {
    private int id;
    private int autoNumber;

    public Car(int id, int autoNumber) {
        this.id = id;
        this.autoNumber = autoNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(int autoNumber) {
        this.autoNumber = autoNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", autoNumber=" + autoNumber +
                '}';
    }
}
