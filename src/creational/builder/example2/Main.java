package creational.builder.example2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder sedanCarBuilder = new CarBuilder();
        director.constructSedanCar(sedanCarBuilder);
        Car sedanCar = sedanCarBuilder.build();
        System.out.println(sedanCar);

        CarBuilder sportsCarBuilder = new CarBuilder();
        director.constructSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.build();
        System.out.println(sportsCar);

        CarBuilder suvCarBuilder = new CarBuilder();
        director.constructSUVCar(suvCarBuilder);
        Car suvCar = suvCarBuilder.build();
        System.out.println(suvCar);
    }
}
