package creational.builder.example2;

public interface Builder {
    void setSeats(int seats);
    void setFuelType(String fuelType);
    void setMaxSpeed(int maxSpeed);
    void setCarType(String carType);
    void setPrice(int price);
}
