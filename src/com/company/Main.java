package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, InfoCar> map = new HashMap<>();
        map.put(new Car(2,011),new InfoCar(1999,"Lexus",20000,"black"));
        map.put(new Car(1,012),new InfoCar(2010,"Nissan",10000,"white"));
        map.put(new Car(3,013),new InfoCar(2015,"Kia",10000,"black"));


        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }
}
