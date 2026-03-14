package carEngine;

class CarTest {

    public static void main(String[] args) {

        Engine e = new Engine("V8", "Petrol");

        Car c = new Car("911 CARRERA", "PORSCHE", e);

        c.displayCar();
    }
}