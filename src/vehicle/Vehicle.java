package vehicle;

public class Vehicle {
    private String registration;
    private String make;
    private String model;

    public Vehicle(String make, String model, String registration) {
        this.make = make;
        this.model = model;
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double weight() {
        return registration.charAt(0) == 'A' ? 1 : 2;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "registration='" + registration + '\'' +
               ", make='" + make + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}
