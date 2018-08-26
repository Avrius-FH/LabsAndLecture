package ch10lab1;

public class PowerBoat extends Boat {
    private double engineHP;    // engine horsepower

    public PowerBoat() {
        this ("null", 0.0, 0.0, 0.0, 0.0) ;
    }

    public PowerBoat(String name, double lengthOverAll, double beam, double weightCapacity, double engineHP) {
        super(name, lengthOverAll, beam, weightCapacity);
        setEngineHP(engineHP);
    }

    @Override
    public String toString() {
        return "PowerBoat{" +
                "engineHP=" + engineHP +
                "} " + super.toString();
    }

    public double getEngineHP() {
        return engineHP;
    }

    public void setEngineHP(double engineHP) {
        this.engineHP = engineHP;
    }
}
