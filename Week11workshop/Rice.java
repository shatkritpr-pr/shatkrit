package Week11workshop;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Rice extends Crop implements Transportable{

    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 4.5; // tons per hectare
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 1200000; // high water usage
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 2000; // higher cost due to wet terrain
    }

    @Override
    public String getTransportMethod() {
        return "Tractor / Small Truck (Rural Roads)";
    }
}
