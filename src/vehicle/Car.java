package vehicle;

public class Car extends Vehicle{
    private byte numSeats;
    private byte numDoors;
    private String fuelType;

    public Car(String make, String model, String registration, byte numSeats, byte numDoors, String fuelType) {
        super(make, model, registration);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public byte getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(byte numSeats) {
        this.numSeats = numSeats;
    }

    public byte getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(byte numDoors) {
        this.numDoors = numDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double weight() {
        return numSeats * numDoors * super.weight();
    }

    public boolean has4Doors() {
        return numDoors >= 4;
    }

    @Override
    public String toString() {
        return "Car{" +
               "numSeats=" + numSeats +
               ", numDoors=" + numDoors +
               ", fuelType='" + fuelType + '\'' +
               "} " + super.toString();
    }
}
