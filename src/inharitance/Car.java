package inharitance;

public class Car {
    private int wheels;
    private String brand;
    private String type;

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

    public String getCarInformation() {
        return "Car options:" + "\n" +
                "Wheels: " + wheels + "\n" +
                "Brand: " + brand + "\n" +
                "Type: " + type + "\n";
    }
}
