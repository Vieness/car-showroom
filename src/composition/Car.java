package composition;

import java.util.Objects;

public class Car {
    private int wheels;
    private String brand;
    private String type;

    private Equipment equipment;

    public Car() {
    }

    public int getWheels() {
        return wheels;
    }

    public Car setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getType() {
        return type;
    }

    public Car setType(String type) {
        this.type = type;
        return this;
    }


    public Equipment getEquipment() {
        return equipment;
    }

    public Car setEquipment(Equipment equipment) {
        this.equipment = equipment;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels && Objects.equals(brand, car.brand) && Objects.equals(type, car.type) && Objects.equals(equipment, car.equipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, brand, type, equipment);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", equipment=" + equipment +
                '}';
    }
}
