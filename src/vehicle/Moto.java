package vehicle;

public class Moto extends Vehicle {
    private int cc;

    public Moto(String make, String model, String registration, int cc) {
        super(make, model, registration);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public double weight() {
        return cc * super.weight() / 10;
    }

    @Override
    public String toString() {
        return "Moto{" +
               "cc=" + cc +
               "} " + super.toString();
    }
}
