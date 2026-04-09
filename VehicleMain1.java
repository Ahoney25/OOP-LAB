interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started with a key.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started with a kick.");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }
}

public class VehicleMain1 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();

        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}