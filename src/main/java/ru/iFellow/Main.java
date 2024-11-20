package ru.iFellow;

import ru.iFellow.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <Car> void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();
        carList.add((Car) new Suzuki(2010, "Автомат", "Зеленый", "Бензин", "SUZ123456789"));
        carList.add((Car) new Toyota(2005, "Механика", "Красный", "Дизель", "TOY123456789"));
        carList.add((Car) new Ford(2018, "Автомат", "Синий", "Бензин", "FOR123456789"));
        carList.add((Car) new Honda(2002, "Механика", "Зеленый", "Электро", "HON123456789"));
        carList.add((Car) new BMW(2020, "Автомат", "Черный", "Бензин", "BMW123456789"));
        carList.add((Car) new Suzuki(2001, "Механика", "Синий", "Дизель", "SUZ987654321"));
        carList.add((Car) new Toyota(2015, "Автомат", "Зеленый", "Бензин", "TOY987654321"));
        carList.add((Car) new Ford(2008, "Механика", "Красный", "Дизель", "FOR987654321"));
        carList.add((Car) new Honda(2021, "Автомат", "Черный", "Электро", "HON987654321"));
        carList.add((Car) new BMW(2007, "Механика", "Зеленый", "Бензин", "BMW987654321"));
        printCarsAfter2006(carList);
        changeGreenToRed(carList);
        printCarsAfter2006(carList);
    }
    public static void printCarsAfter2006(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.checkCarAge());
        }
    }
    public static void changeGreenToRed(List<Car> cars) {
        for (Car car : cars) {
            if (car.getColor().equals("Зеленый")) {
                car.changeColor("Красный");
            }
        }
    }
}