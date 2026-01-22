package Week11workshop;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Hill / Summer", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 2.8;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 400000;
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 1000;
    }

    @Override
    public String getTransportMethod() {
        return "Mule / Small Pickup (Remote Areas)";
    }
}
