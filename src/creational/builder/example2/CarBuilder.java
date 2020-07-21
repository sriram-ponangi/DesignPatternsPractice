package creational.builder.example2;

public class CarBuilder implements Builder{
    private int seats;
    private String fuelType;
    private int maxSpeed;
    private String carType;
    private int price;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public Car build() {
        return new Car(seats, fuelType, maxSpeed, carType, price) ;
    }
}

