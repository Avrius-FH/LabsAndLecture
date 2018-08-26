package ch10lab1;

public class Boat {

    private String name ;              // name of the boat
    private double lengthOverAll;      // total length of the boat
    private double beam ;
    private double weightCapacity ;    // how much the boat can take on

    public Boat() {
        this ("null" , 0.0, 0.0, 0.0) ;
    }

    public Boat(String name, double lengthOverAll, double beam, double weightCapacity) {
        setName(name);
        setLengthOverAll(lengthOverAll);
        setBeam(beam);
        setWeightCapacity(weightCapacity);
    }

    public String getName() {
        return name;
    }

    public double getBeam() {
        return beam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLengthOverAll(double lengthOverAll) {
        this.lengthOverAll = lengthOverAll;
    }

    public void setBeam(double beam) {
        this.beam = beam;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", lengthOverAll=" + lengthOverAll +
                ", beam=" + beam +
                ", weightCapacity=" + weightCapacity +
                '}';
    }
}
