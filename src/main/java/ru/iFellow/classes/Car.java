package ru.iFellow.classes;

public abstract class Car {
    String model;
    int yearOfManufacture;
    String transmission;  // автоматическая/механическая
    String color;
    String fuelType;
    String vin;
    public Car(String model, int yearOfManufacture, String transmission, String color, String fuelType, String vin) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.transmission = transmission;
        this.color = color;
        this.fuelType = fuelType;
        this.vin = vin;
    }
    public String getCarInfo() {
        return "Модель: " + model + ", Год выпуска: " + yearOfManufacture + ", Коробка: " + transmission
                + ", Цвет: " + color + ", Тип топлива: " + fuelType + ", VIN: " + vin;
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public String getColor() {
        return color;
    }
    // Метод для проверки на старый авто
    public String checkCarAge() {
        if (yearOfManufacture > 2006) {
            return getCarInfo();
        } else {
            return "Устаревший авто";
        }
    }
}
