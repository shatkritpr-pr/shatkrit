package Week11workshop;


/**
 * Write a description of class FarmManagementSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FarmManagementSystem {

    public static void main(String[] args) {

        Crop[] crops = new Crop[3];
        crops[0] = new Rice(1.5);   // 1.5 hectares
        crops[1] = new Wheat(1.0);  // 1 hectare
        crops[2] = new Maize(0.8);  // 0.8 hectare

        for (Crop crop : crops) {
            crop.displayCropInfo();

            if (crop instanceof Transportable) {
                Transportable t = (Transportable) crop;
                System.out.println("Transport Method: " + t.getTransportMethod());
                System.out.println("Estimated Transport Cost (NPR): " + t.calculateTransportCost());
            }

            
        }
    }
}