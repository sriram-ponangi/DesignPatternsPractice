package creational.builder.example2;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType("SPORTS");
        builder.setSeats(2);
        builder.setFuelType("PETROL");
        builder.setMaxSpeed(250);
        builder.setPrice(100000);
    }

    public void constructSedanCar(Builder builder) {
        builder.setCarType("SEDAN");
        builder.setSeats(4);
        builder.setFuelType("PETROL");
        builder.setMaxSpeed(120);
        builder.setPrice(20000);
    }

    public void constructSUVCar(Builder builder) {
        builder.setCarType("SUV");
        builder.setSeats(6);
        builder.setFuelType("DIESEL");
        builder.setMaxSpeed(150);
        builder.setPrice(45000);
    }
}
