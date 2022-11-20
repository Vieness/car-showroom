import composition.Equipment;
import inharitance.Bmw;
import inharitance.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Bmw()
                .setInterior("Leather")
                .setAbs(true)
                .setDriveUnit("Four-wheel drive")
                .setType("Sedan")
                .setBrand("BMW")
                .setWheels(4);
        System.out.println(car.getCarInformation());

        composition.Car carAudi = new composition.Car()
                .setEquipment(new Equipment()
                        .setAbs("+")
                        .setDriveUnit("4")
                        .setInterior("cloth")
                ).setType("sedan")
                .setWheels(4)
                .setBrand("Audi");
        System.out.println(carAudi);
    }

}