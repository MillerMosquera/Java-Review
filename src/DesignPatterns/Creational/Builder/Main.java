package DesignPatterns.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        /*
        -Nos permite construir objetos complejos paso a paso.
        -El patrón nos permite producir distintos tipos y
        -representaciones de un objeto empleando el mismo código de construcción.
         */
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car);

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSportCar(carManualBuilder);
        Manual manual = carManualBuilder.getResult();
        System.out.println(manual);



    }
}
