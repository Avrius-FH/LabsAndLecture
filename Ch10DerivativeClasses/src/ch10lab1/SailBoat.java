package ch10lab1;

public class SailBoat extends Boat {
    private double sailArea ;          // area of the sail

    public SailBoat() {
        this("null", 0.0, 0.0, 0.0, 0.0) ;
    }

    public SailBoat(String name, double lengthOverAll, double beam, double weightCapacity, double sailArea) {
        super(name, lengthOverAll, beam, weightCapacity);
        setSailArea(sailArea);
    }

    @Override
    public String toString() {
        return "SailBoat{" +
                "sailArea=" + sailArea +
                "} " + super.toString();
    }

    public double getSailArea() {
        return sailArea;
    }

    public void setSailArea(double sailArea) {
        this.sailArea = sailArea;
    }
}
