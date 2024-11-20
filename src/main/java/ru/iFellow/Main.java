package ru.iFellow;

public class  Main  {
    public static void  Main (String[] args) {
        abstract class Car {
            String model;//модель
            int maxSpeed;//максимальная скорость
            int wheels;//ширина дисков
            double engineVolume;//объем двигателя
            String color;//цвет
            int yearOfIssue;//год выпуска
            long price;//цена

            public Car( String model, int maxSpeed, int wheels, double engineVolume, String color, int yearOfIssue, long price) {
                this.model = model;
                this.yearOfIssue = yearOfIssue;
                this.maxSpeed = maxSpeed;
                this.color = color;
                this.wheels = wheels;
                this.engineVolume = engineVolume;
                this.price = price
            }
                public String getCarInfo() {
                    return "Модель: " + model + ", Год выпуска: " + yearOfIssue + ", ширина дисков: " + wheels
                            + ", Цвет: " + color + ", максимальная скорость: " + maxSpeed + ", объем двигателя: " + engineVolume + ", цена: " + price;
                }
                    class Suzuki extends Car {
                        public Suzuki(model, int maxSpeed, int wheels, double engineVolume, String color, int yearOfIssue, long price) {
                        }

                        class Toyota extends Car {
                            public Toyota(model, int maxSpeed, int wheels, double engineVolume, String color, int yearOfIssue, long price) {


                                class Ford extends Car {
                                    public Ford(model, int maxSpeed, int wheels, double engineVolume, String color, int yearOfIssue, long price) {

                                        class Honda extends Car {
                                            public Honda(model, int maxSpeed, int wheels, double engineVolume, String color, int yearOfIssue, long price) {
                                                class Honda extends Car {
                                                    public Honda(model, int maxSpeed, int wheels, double engineVolume, String color, int yearOfIssue, long price) {
            public static void main(String[] args) {
                Car BMV = new Car();
                BMV.color = "green";
                BMV.maxSpeed = 200
                BMV.wheels = 17
                BMV.engineVolume = 1.7;
                BMV.yearOfIssue = 2007
                BMV.price = 2000000;
        }
    }
}