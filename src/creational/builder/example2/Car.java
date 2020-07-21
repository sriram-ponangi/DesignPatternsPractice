package creational.builder.example2;

public class Car {
    private int seats;
    private String fuelType;
    private int maxSpeed;
    private String carType;
    private int price;

    public Car(int seats, String fuelType, int maxSpeed, String carType, int price) {
        this.seats = seats;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.carType = carType;
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCarType() {
        return carType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", fuelType='" + fuelType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", carType='" + carType + '\'' +
                ", price=" + price +
                '}';
    }
}
