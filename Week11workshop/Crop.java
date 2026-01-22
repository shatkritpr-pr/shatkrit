package Week11workshop;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public abstract class Crop {

    protected String cropName;
    protected String season;
    protected double landArea; // in hectares

    public Crop(String cropName, String season, double landArea) {
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }

    // Abstract methods
    public abstract double calculateYield(); // in tons
    public abstract double calculateWaterRequirement(); // in liters

    // Concrete method
    public void displayCropInfo() {
        System.out.println("Crop Name: " + cropName);
        System.out.println("Season: " + season);
        System.out.println("Land Area (hectares): " + landArea);
        System.out.println("Estimated Yield (tons): " + calculateYield());
        System.out.println("Water Requirement (liters): " + calculateWaterRequirement());
    }
}
    
