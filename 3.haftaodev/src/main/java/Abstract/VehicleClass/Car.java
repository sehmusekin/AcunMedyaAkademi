package Abstract.VehicleClass;

class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(brand + " araba " + speed + " km/h hızla gidiyor.");
    }
}
