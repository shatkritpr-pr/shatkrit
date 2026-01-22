package Week11workshop;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Wheat extends Crop implements Transportable {

    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 3.2;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 700000;
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 1500;
    }

    @Override
    public String getTransportMethod() {
        return "Mini Truck / Tractor";
    }
}