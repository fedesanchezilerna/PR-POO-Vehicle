package vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instancias
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", "B1234");
        Vehicle carAsVehicle = new Car("Honda", "Civic", "A5678", (byte) 5, (byte) 4, "Gasoline");
        Car car = new Car("Ford", "Focus", "C9101", (byte) 4, (byte) 2, "Diesel");
        Vehicle motoAsVehicle = new Moto("Yamaha", "R1", "D1122", 600);
        Moto moto = new Moto("Ducati", "Panigale", "E3344", 1200);
        Vehicle truckAsVehicle = new Truck("Volvo", "FH16", "F5566", (byte) 2, (byte) 2, "Diesel", 15000, true);
        Truck truck = new Truck("Mercedes", "LH44", "G7788", (byte) 2, (byte) 2, "Diesel", 10000, false);

        // Lista de vehículos
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle);
        vehicles.add(carAsVehicle);
        vehicles.add(car);
        vehicles.add(motoAsVehicle);
        vehicles.add(moto);
        vehicles.add(truckAsVehicle);
        vehicles.add(truck);

        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
            System.out.println("Weight: " + v.weight());

            if (v instanceof Moto) {
                System.out.println("CC: " + ((Moto) v).getCc());
            }
            if (v instanceof Car) {
                System.out.println("Has 4 Doors: " + ((Car) v).has4Doors());
                System.out.println("Num Seats: " + ((Car) v).getNumSeats());
                System.out.println("Num Doors: " + ((Car) v).getNumDoors());
                System.out.println("Fuel Type: " + ((Car) v).getFuelType());
            }
            if (v instanceof Truck) {
                System.out.println("Max Load: " + ((Truck) v).getMaxLoad());
                System.out.println("Has Fridge: " + ((Truck) v).isHasFridge());
            }

            System.out.println("---------------------------");
        }
    }
}
