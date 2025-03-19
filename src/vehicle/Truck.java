package vehicle;

public class Truck extends Car {
    private int maxLoad;
    private boolean hasFridge;

    public Truck(String make, String model, String registration, byte numSeats, byte numDoors, String fuelType, int maxLoad, boolean hasFridge) {
        super(make, model, registration, numSeats, numDoors, fuelType);
        this.maxLoad = maxLoad;
        this.hasFridge = hasFridge;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public boolean isHasFridge() {
        return hasFridge;
    }

    public void setHasFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
    }

    @Override
    public double weight() {
        return hasFridge ? maxLoad * 2 * super.weight() : maxLoad * super.weight();
    }

    @Override
    public String toString() {
        return "Truck{" +
               "maxLoad=" + maxLoad +
               ", hasFridge=" + hasFridge +
               "} " + super.toString();
    }
}
